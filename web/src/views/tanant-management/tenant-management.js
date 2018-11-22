import { mapState, mapActions } from 'vuex'
import commFun from '@/utils/common-function.js'
import Constants from '@/utils/constants.js'

export default {
    computed: {
        ...mapState('tenantManagement', {
            tenantList: state => state.tenantList
        }),
        ...mapState('common', {
            loginUser: state => state.loginUser
        })
    },
    data () {
        return {
            loading:false,
            dialog: {
                show: false,
                width: '50%',
                title: '新增租户',
                pageShow: 'addTenant',
            },
            tenantForm: {
                'alias': 'cuet', //别名
                'cdrName': 'cdrName', //cdr租户id
                'cdrPublicKey': 'cdrPublicKey', //公
                'identifier': 'identifier', //no
                'keyStoreContent': 'zhbe', //证书
                'keyStorePassword': 'keyStorePassword', //证书密码
                'nestDescription': 'nestDescription', //nest描述
                'nestIdentifier': 'nestIdentifier', //租户id
                'nestName': 'nestName', //Nest租户名称
                'privateKeyPassword': 'privateKeyPassword', //私钥密码
                'symmetricKey': 'symmetricKey' //CDR对称密钥
            },
            rulesTenantForm: {
                nestIdentifier: [{required: true, message: '不能为空', trigger: 'blur'}],
                nestName: [{required: true, message: '不能为空', trigger: 'blur'}],
                nestDescription: [{required: true, message: '不能为空', trigger: 'blur'}],
                cdrName: [{required: true, message: '不能为空', trigger: 'blur'}],
                symmetricKey: [{required: true, message: '不能为空', trigger: 'blur'}],
                cdrPublicKey: [{required: true, message: '不能为空', trigger: 'blur'}],
                keyStoreContent: [{required: true, message: '不能为空', trigger: 'blur'}],
                privateKeyPassword: [{required: true, message: '不能为空', trigger: 'blur'}],
                keyStorePassword: [{required: true, message: '不能为空', trigger: 'blur'}],
                alias: [{required: true, message: '不能为空', trigger: 'blur'}],
            },
            editTenantIndex: '',
            search: { //搜索
                name: '',//名称
                size: 10,
                page: 1,
                cdrName: '',
                nestName: '',
            },
            tenantsTotal: 100,
        }
    },
    methods: {
        ...mapActions('tenantManagement', ['saveTenant', 'getTenantList', 'getcode', 'saveEditTenant', 'archiveTenant']),
        /*
        点击新增租户
         */
        clickAddTenant(){
            this.editTenantIndex=''
            this.initTenantForm()
            commFun.setDialog(this.dialog, true, '50%', '新增租户', 'addTenant')
        },
        /**
         * 初始化租户form
         */
        initTenantForm(){
            this.tenantForm = {
                'alias': '', //别名
                'cdrName': '', //cdr租户id
                'cdrPublicKey': '', //公
                'identifier': '', //no
                'keyStoreContent': '', //证书
                'keyStorePassword': '', //证书密码
                'nestDescription': '', //nest描述
                'nestIdentifier': '', //租户id
                'nestName': '', //Nest租户名称
                'privateKeyPassword': '', //私钥密码
                'symmetricKey': '' //CDR对称密钥
            }
        },
        /**
         * 当cdr公钥文件改变的时候
         */
        onChangeKeyStoreFile(event, type){
            let file = event.target.files[0]
            this.getcode(file).then((datas) => {
                if (datas.data.content) {
                    if (type === 'publiceKey') {
                        this.tenantForm.cdrPublicKey = datas.data.content
                    } else {
                        this.tenantForm.keyStoreContent = datas.data.content
                    }
                }
            })

        },
        /**
         * 点击编辑租户
         */
        clickEditTenant(row, index){
            this.editTenantIndex = index
            this.tenantForm = lodash.cloneDeep(row)
            commFun.setDialog(this.dialog, true, '50%', '编辑租户', 'addTenant')
        },
        /**
         *确定提交租户信息 -保存租户
         */
        confimSubmitTenant(){
            this.$refs.tenantForm.validate((valid) => {
                if (valid) {
                    if (this.editTenantIndex || this.editTenantIndex === 0) {
                        this.saveEditTenant(this.tenantForm).then((datas) => {
                            this.saveSuccess(datas, 'edit')
                        })
                    } else {
                        this.saveTenant(this.tenantForm).then((datas) => {
                            this.saveSuccess(datas, 'create')
                        })
                    }
                }
            })
        },
        /**
         * 保存成功
         * @param datas
         */
        saveSuccess(datas, type){
            if (datas.status === 200) {
                let message = '保存成功'
                this.dialog.show = false
                if (type === 'edit') {
                    message = '编辑成功'
                    this.tenantList.splice(this.editTenantIndex, 1, this.tenantForm)
                } else {
                    this.getTenantsAndTotal() //刷新租户列表
                }
                this.$message.success(message)
            }
        },
        /**
         * 点击归档租户
         */
        clickArchiveTenant(row, index){
            this.$confirm(Constants.archiveConfirm.content, Constants.archiveConfirm.title, {
                confirmButtonText: Constants.archiveConfirm.ok,
                cancelButtonText: Constants.archiveConfirm.cancel,
                type: Constants.archiveConfirm.type
            }).then(() => {
                this.editTenantIndex = index
                this.archiveTenant(row.identifier).then((datas) => {
                    if (datas.status === 200) {
                        this.tenantList[this.editTenantIndex].archived = true
                        this.$message.success('归档成功')
                        this.getTenantsAndTotal()

                    }
                })
            }).catch(() => {})
        },
        /**
         * 获取租户列表和条数
         */
        getTenantsAndTotal(){
            this.loading=true
            this.getTenantList(this.search).then((datas) => {
                this.loading=false
                if (datas.data.totalElements) {
                    this.tenantsTotal = datas.data.totalElements
                }

            })
        },
        /**
         * 点击进入租户页面
         */
        clickTenantPage(row){
            this.loginUser.id = row.identifier
            this.loginUser.showName = row.identifier
            this.$router.push({
                path: '/messageList',
                name: 'messageList',
            })
            axios.defaults.headers.common['x-coordinator-tenant-id'] = this.loginUser.id
        }
    },
    mounted () {
        delete axios.defaults.headers.common['x-coordinator-tenant-id']
        this.getTenantsAndTotal()
    },
    watch: {
        // screenHeight(){}
    }
}

