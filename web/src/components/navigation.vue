<template>

    <div>
        <div class="navigation">
            <div style="position: relative;">
                <div class="logo" v-show="!smallMenu">
                    <img src="./../assets/nestvision.png" alt="logo">
                </div>
                <div class="small-logo" style="font-size:10px" v-show="smallMenu">
                    coor
                </div>
                <el-menu :unique-opened="true" :router="true" :default-active="$route.path" class="el-menu-vertical-demo" theme="dark"
                         :collapse="smallMenu"
                         background-color="#034876"
                         text-color="#fff">
                    <el-menu-item index="/tenantManagement" v-if="loginUser.showName==='admin'"><i
                            class="fa fa-home"></i><span
                            slot="title">租户管理</span>
                    </el-menu-item>

                    <el-submenu index="index" v-for="(menu,index) in pageParamList" :key="index">
                        <template slot="title">
                            <i class="fa fa-envira" aria-hidden="true"></i>
                            <span>{{menu.name}}</span>
                        </template>
                        <el-menu-item-group>
                            <!--messageList/:funName/interfaceName:field:menuName:id-->
                            <el-menu-item v-for="(p,pIndex) in menu.children"  :key=pIndex
                                          :index="'/messageList/'+p.interfaceName" >
                                {{p.menuName}}
                            </el-menu-item>

                        </el-menu-item-group>
                    </el-submenu>
                </el-menu>
            </div>
        </div>
    </div>


</template>

<script>
    import { mapState } from 'vuex'
    import pageParamList from '@/utils/page-param-list.js'

    export default {
        computed: {
            ...mapState('common', {
                smallMenu: state => state.smallMenu,
                loginUser:state=>state.loginUser
            })
        },
        data () {
            return {
                path: '',
                pageParamList:pageParamList.paramList
            }
        },
        methods: {
            // ...mapActions(['changeRole']),
            // ...mapMutations(['CHANGE_ROLE']),
            getPath () {
                if (this.$route.path.indexOf('/tenant/deployment-wizard') !== -1) {
                    this.path = '/tenant/deployment'
                } else {
                    if (this.$route.matched[1] && this.$route.matched[1].path.indexOf(':') !== -1) {
                        const num = this.$route.matched[1].path.indexOf(':')
                        this.path = this.$route.matched[1].path.substr(0, num - 1)
                    } else {
                        this.path = this.$route.path
                    }
                }
            }
        },
        created: function () {
//            this.getPath()
        },
        beforeMount () {
            // const tenantId = sessionStorage.getItem('tenantId')
            // if (tenantId) {
            //     this.CHANGE_ROLE(tenantId)
            // } else {
            //     this.CHANGE_ROLE()
            //     this.$router.push({
            //         name: 'admin-home',
            //         params: {}
            //     })
            // }
        },
        watch: {
            '$route' (to, from) {

            }
        }
    }
</script>

<style>

</style>
