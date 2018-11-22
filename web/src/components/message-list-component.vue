<template>
    <div>
        <el-dialog :title="dialog.title" :visible.sync="dialog.show" :width="dialog.width"
                   :close-on-click-modal="false">
            <!--查看表数据-->
            <template v-if="dialog.pageShow==='cdr'">
                <div>
                    <el-input
                            disabled
                            type="textarea"
                            :rows="20"
                            v-model="cdrMessage">
                    </el-input>
                </div>
                <div slot="footer" class="dialog-footer">
                    <el-button @click="dialog.show = false" size="mini" type="primary">确定</el-button>
                </div>
            </template>
            <template v-else-if="dialog.pageShow==='viewMessageDetail'">
                <div>
                    <el-tabs v-model="messageActive" type="card">
                        <el-tab-pane label="请求内容" name="requestContent">
                            <el-card class="content_max_height">
                                {{messageDetail.detail}}
                            </el-card>
                        </el-tab-pane>
                        <el-tab-pane label="异常消息" name="exceptionMessage">
                            <el-card class="content_max_height">
                                {{messageDetail.errorMessage}}
                            </el-card>
                        </el-tab-pane>
                    </el-tabs>
                </div>
                <div slot="footer" class="dialog-footer">
                    <el-button @click="dialog.show = false" size="mini" type="primary">确定</el-button>
                </div>
            </template>
            <template v-else-if="dialog.pageShow==='viewHistoryDetail'">
                <div>
                    <el-tabs v-model="historyActive" type="card">
                        <el-tab-pane label="请求内容" name="requestContent">
                            <el-card class="content_max_height">
                                {{historyDetail.body}}
                            </el-card>
                        </el-tab-pane>
                        <el-tab-pane label="异常消息" name="exceptionMessage">
                            <el-card class="content_max_height">
                                {{historyDetail.errorMessage}}
                            </el-card>
                        </el-tab-pane>
                    </el-tabs>
                </div>
                <div slot="footer" class="dialog-footer">
                    <el-button @click="dialog.show = false" size="mini" type="primary">确定</el-button>
                </div>
            </template>
        </el-dialog>

        <div>
            <div class="search_wrap">
                <div>
             <span>
                 业务主键
             </span>
                    <el-input v-model="search.bizId" placeholder="请输入内容"></el-input>
                </div>
                <div>
             <span>
                 时间区间
             </span>
                    <div class="block">
                        <el-date-picker
                                v-model="search.time"
                                type="datetimerange"
                                range-separator="至"
                                start-placeholder="开始日期"
                                end-placeholder="结束日期">
                        </el-date-picker>
                    </div>
                </div>
                <div>
             <span>
                状态
             </span>
                    <el-select v-model="search.status" placeholder="请选择">
                        <el-option
                                v-for="item in statusList"
                                :key="item.value"
                                :label="item.label"
                                :value="item.value">
                        </el-option>
                    </el-select>
                </div>
                <el-button style="margin-top: 3px;" size="mini" type="success" @click="getMessageListAndTotal"><i class="el-icon-search"></i></el-button>
            </div>
            <div>
                <div class="padd10">
                    <el-button type="danger" size="mini" @click="clickDelete">删除</el-button>
                </div>
                <div>
                    <el-table v-if="pageParam&&pageParam.bizIdField" :data="messageList" stripe border style="width: 100%"
                              v-loading="loading"
                              element-loading-text="拼命加载中"
                              element-loading-spinner="el-icon-loading"
                              element-loading-background="rgba(0, 0, 0, 0.8)"
                              @selection-change="handleSelectionChange">
                        <el-table-column
                                type="selection"
                                :selectable="selectable"
                                width="55">
                        </el-table-column>
                        <!--<el-table-column prop="id" label="id" fixed></el-table-column>-->
                        <el-table-tree-column
                                fixed
                                :remote="getHistoryList"
                                file-icon="icon icon-file" folder-icon="icon icon-folder"
                                width="150"
                                label="业务主键" header-align="center">
                            <template slot-scope="scope">
                               <span v-text="scope.row[pageParam.bizIdField]">
                               </span>
                            </template>
                        </el-table-tree-column>
                        <el-table-column
                                width="200"
                                label="时间">
                            <template slot-scope="scope">
                               <span v-if="scope.row.upTime">
                                   <span v-text="formatTime(scope.row.upTime,'yyyy-MM-dd HH:ss')"></span>
                               </span>
                                <span v-else-if="scope.row.sendTime">
                                    <span v-text="formatTime(scope.row.sendTime,'yyyy-MM-dd HH:ss')"></span>
                               </span>
                            </template>
                        </el-table-column>
                        <el-table-column
                                width="150"
                                label="状态">
                            <template slot-scope="scope">
                            <span v-if="scope.row.processResult" v-text="getStatusMessage(scope.row.processResult).message"
                                  :class="getStatusMessage(scope.row.processResult).clas"></span>
                            </template>
                        </el-table-column>
                        <el-table-column
                                label="异常信息">
                            <template slot-scope="scope">
                                <div :title="scope.row.errorMessage" style="width:100%;text-overflow:ellipsis; overflow: hidden;white-space:nowrap;">
                                    {{scope.row.errorMessage}}
                                </div>
                            </template>
                            <span>

                        </span>
                        </el-table-column>
                        <el-table-column
                                width="150"
                                label="操作">
                            <template slot-scope="scope">
                                <span v-if="scope.row.uid">
                                     <el-button v-if="scope.row.uid" size="mini" type="primary" @click="clickViewDetail(scope.row,'message')">查看详情</el-button>
                                  <el-button size="mini" type="success" @click="clickCdrSearch(scope.row)">cdr查询</el-button>
                                </span>
                                <span v-else>
                                     <el-button size="mini" type="primary" @click="clickViewDetail(scope.row,'history')">查看详情1</el-button>
                                     <el-button size="mini" type="success" @click="clickSend(scope.row.id)">发送</el-button>
                                </span>

                            </template>
                        </el-table-column>
                    </el-table>
                </div>
                <div class="marg_top10 overflow">
                    <div class="flo_right">
                        <el-pagination
                                @current-change="getMessageListAndTotal"
                                :current-page.sync="search.page"
                                :page-size="search.size"
                                layout="prev, pager, next, jumper"
                                :total="messageTotal">
                        </el-pagination>
                    </div>

                </div>


            </div>
        </div>
    </div>

</template>

<script>
    import { mapState, mapActions } from 'vuex'
    import { formatTime } from '@/utils/date-util.js'
    import pageParamList from '@/utils/page-param-list.js'
    import ElButton from '../../node_modules/element-ui/packages/button/src/button'
    import CommonFun from '@/utils/common-function.js'

    export default {
        name: 'commonPage',
        components: {ElButton},
        props: [],
        computed: {
//            ...mapState('common', {})
        },
        data () {
            return {
                statusList: [ //状态列表
                    {label: '处理成功', value: 'SUCCESS'},
                    {label: '其它异常', value: 'GENERIC_EXCEPTION'},
                    {label: '消息验证不通过', value: 'VALIDATE_EXCEPTION'},
                    {label: '消息引用不通过', value: 'COORDINATOR_EXCEPTION'}
                ],
                loading: false,
                dialog: {
                    show: false,
                    width: '',
                    title: '',
                    pageShow: ''
                },
                messageList: [],
                search: { //搜索的条件
                    bizId: '', //业务主键
                    status: '',//状态
                    time: '',
                    size: 10,
                    page: 1,
                },
                messageTotal: 1, //信息的总条数
                pageParam: { //通过路由获取的参数
                    bizIdField: ''
                },
                formatTime: formatTime,
                messageActive: 'requestContent',//查看消息详情的默认选中
                historyActive: 'requestContent',//查看历史详情的默认选中
                cdrMessage: '',//cdr查询信息
                messageDetail: {
                    errorMessage: '',
                    uid: ''
                },//消息详情
                historyDetail: {},
                deleteIds: [],//删除ids
            }
        },
        methods: {
            ...mapActions('messageList', ['getMessageList', 'getHistories', 'getMessageDetail', 'getHistoryDetail', 'deleteMessage',
                'getTableField', 'sendMessage']),
            /**
             * 获取历史记录信息列表
             */
            getHistoryList(row, callback){
                if (row.uid) {
                    this.getHistories({uid: row.uid, pageParam: this.pageParam}).then((datas) => {
                        let historyList = datas.data
                        lodash.forEach(historyList, m => {
                            m.parent_id = row.uid
                            m.child_num = 0
                            m.depth = row.depth + 2

                        })
                        callback(historyList)
                        row.children = historyList
                    })
                }
            },
            /**
             * 当selection改变的时候，获取选中的数据
             */
            handleSelectionChange(selections){
                this.deleteIds.splice(0, this.deleteIds.length)
                lodash.forEach(selections, s => {
                    if (s.uid) {
                        this.deleteIds.push(s.uid)
                    }
                })
            },
            /**
             * 获取状态信息
             * SUCCESS, 处理成功
             GENERIC_EXCEPTION, 其它异常
             VALIDATE_EXCEPTION, 消息验证不通过
             COORDINATOR_EXCEPTION 消息引用不通过
             */
            getStatusMessage(status){
                const message = {
                    'SUCCESS': {message: '处理成功', clas: 'color_success'},
                    'GENERIC_EXCEPTION': {message: '其它异常', clas: 'color_warning'},
                    'VALIDATE_EXCEPTION': {message: '消息验证不通过', clas: 'color_error'},
                    'COORDINATOR_EXCEPTION': {message: '消息引用不通过', clas: 'color_error'},
                }
                return message[status]
            },
            /**
             * 获取messageList
             */
            getMessageListAndTotal(){
                this.loading = true
                this.getMessageList({interfaceName: this.pageParam.interfaceName, search: this.search}).then((datas) => {
                    this.loading = false
                    if (datas.status === 200) {
                        this.messageTotal = datas.data.totalElements
                        this.messageList = this.transformMessageList(datas.data.content)
                    }
                    setTimeout(() => {
                        this.loading = false
                    }, 1000)

                })
            },
            /**
             * 转换第一次获取的信息列表
             */
            transformMessageList(messages){
                let newMessages = []
                for (let i in messages) {
                    let message = lodash.cloneDeep(messages[i])
                    message.child_num = 1 //是否有子节点
                    message.depth = 0 //深度
                    message.id = messages[i].uid
                    newMessages.push(message)
                }
                return newMessages
            },
            /**
             * 获取页面参数
             */
            getPageParam(interfaceName){
                lodash.forEach(pageParamList.paramList, p => {
                    let pageParam = lodash.filter(p.children, c => {
                        return c.interfaceName === interfaceName
                    })
                    if (pageParam.length) {
                        this.pageParam = pageParam[0]
                    }
                })
            },
            /**
             * 点击cdr查询
             * @param row
             */
            clickCdrSearch(row){
                CommonFun.setDialog(this.dialog, true, '60%', 'cdr展示', 'cdr');
            },
            /**
             * 查看消息详情
             * @param row
             * @param type
             */
            clickViewDetail(row, type){
                if (type === 'message') {
                    this.getMessageDetail({pageParam: this.pageParam, messageId: row.uid}).then((datas) => {
                        if (datas.status === 200) {
                            this.messageDetail = {
                                errorMessage: datas.data.errorMessage
                            }
                            delete datas.data.errorMessage
                            this.messageDetail.detail = datas.data;
                            CommonFun.setDialog(this.dialog, true, '80%', '消息详情', 'viewMessageDetail');
                        }
                    })
                } else {
                    this.getHistoryDetail({pageParam: this.pageParam, message: row}).then((datas) => {
                        if (datas.status === 200) {
                            this.historyDetail = datas.data;
                            CommonFun.setDialog(this.dialog, true, '80%', '历史信息详情', 'viewHistoryDetail');
                        }
                    })
                }
            },
            /**
             * 删除信息
             * @param row
             */
            clickDelete(){
                if (!this.deleteIds.length) {
                    this.$message.warning('请选择要删除的数据')
                    return
                }
                this.deleteMessage({pageParam: this.pageParam, ids: this.deleteIds}).then((datas) => {
                    this.successMessageAlert(datas)
                    if (datas.status === 200) {
                        this.search.page = 1
                        this.getMessageListAndTotal()
                    }
                })
            },
            /***
             *初始化信息页面用的参数
             */
            initMessageParam(){
                this.search = { //搜索的条件
                    bizId: '', //业务主键
                    status: '',//状态
                    time: '',
                    size: 10,
                    page: 1,
                }
                this.messageTotal = 1
                this.messageActive = 'requestContent'
                this.historyActive = 'requestContent'
                this.deleteIds = []
            },
            /**
             * 获取表结构字段
             */
            getTableStructureField(){
                this.getTableField(this.pageParam.interfaceName).then((datas) => {
                    console.log(datas)
                })
            },
            /**
             * 点击发送
             */
            clickSend(hisId){
                this.sendMessage({interfaceName: this.pageParam.interfaceName, id: hisId}).then((datas) => {
                    this.successMessageAlert(datas, 'send')
                })
            },
            /**
             * 信息提示
             * @param datas
             * @param type
             */
            successMessageAlert(datas, type){
                const messages = {'send': '发送成', 'delete': '删除成功', 'save': '保存成功'}
                if (datas.status) {
                    const message = messages[type]
                    this.$message.success(message)
                }
            },
            /**
             *
             */
            selectable(row, index){
                console.log(row)
                console.log(index)
                return false
            }
        },
        mounted(){
            this.getPageParam(this.$route.params.interfaceName)
            this.getMessageListAndTotal()//获取信息列表和总条数
            this.getTableStructureField()//获取表结构字段
        },
        watch: {
            $route: {
                handler(to, from){
                    this.getPageParam(this.$route.params.interfaceName)
                    this.getMessageListAndTotal()
                },
                deep: true
            }
        }
    }
</script>

<style scoped lang="less">
    .search_wrap {
        overflow: hidden;
        padding-bottom: 10px;
        > div {
            overflow: hidden;
            float: left;
            margin-right: 15px;
            display: inline-block;
            line-height: 32px;
        }
        border-bottom: 1px solid #d1d1d1;
        span {
            float: left;
            padding-right: 10px;
        }
        .block {
            float: left;
        }
        .el-input {
            float: left;
            width: 230px;
        }
    }

    .content_max_height {
        max-height: 500px;
        overflow: auto;
    }
</style>
