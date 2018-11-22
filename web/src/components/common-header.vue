<template>
    <div>
        <div class="breadcrumb_wrap overflow">
            <el-button class="flo_left nav_menu marg_right10" type="primary" @click="toggleMenu" size="mini">
                 <i class="fa fa-align-justify" aria-hidden="true"></i>
            </el-button>
            <!--<el-breadcrumb separator="/" class=" flo_left">-->
                <!--<el-breadcrumb-item v-for="(b,index) in breadBeforeList" :key="index">{{b.name}}-->
                <!--</el-breadcrumb-item>-->
                <!--<el-breadcrumb-item v-for="(bread,bIndex) in breadList" :key="bread.value"-->
                                    <!--@click.native="clickBreadcrumn(bread.value)">-->
                    <!--<a :class="{'breadcrumb_a_link' :breadShow===nowRoutePath+'_'+bread.value}">{{bread.name}}</a>-->
                <!--</el-breadcrumb-item>-->
            <!--</el-breadcrumb>-->
            <div class="user flo_right" >
                <el-dropdown trigger="click" >
                          <span class="el-dropdown-link" style="color:#034876;">
                           <i class="fa fa-user-circle-o" aria-hidden="true"></i>
                              {{loginUser.showName}}
                              <i class="el-icon-caret-bottom el-icon--right"></i>
                          </span>
                    <el-dropdown-menu slot="dropdown">
                        <el-dropdown-item @click.native="changeAdminRole" v-if="loginUser.role==='admin'&&loginUser.showName!=='admin'">切换为管理员</el-dropdown-item>
                        <el-dropdown-item @click.native="logout">退出</el-dropdown-item>
                    </el-dropdown-menu>
                </el-dropdown>
            </div>
        </div>
    </div>
</template>

<script>
    import { mapState, mapActions } from 'vuex'
    import ElButton from '../../node_modules/element-ui/packages/button/src/button'

    export default {
        components: {ElButton},
        computed: {
            ...mapState('common', {
                smallMenu: state => state.smallMenu,
                breadList: state => state.breadList,
                breadBeforeList: state => state.breadBeforeList, //菜单栏
//                nowPageShow: state => state.nowPageShow,
                breadShow: state => state.breadShow,
                loginUser:state=>state.loginUser
            })
        },
        data () {
            return {
                nowRoutePath: ''
            }
        },
        methods: {
            ...mapActions('common', ['toggleMenu', 'initBreadcrumb','setNowBreaadcrumb']),
            clickBreadcrumn(breadVal){
                this.$router.push({
                    path: '/' + this.nowRoutePath,
                    name: this.nowRoutePath
                })
                this.initBreadcrumb(this.nowRoutePath) //初始化面包屑
                this.setNowBreaadcrumb(this.nowRoutePath + '_' + breadVal)
            },
            /**
             * 退出
             */
            logout () {
                this.authorization.logout();
            },
            /**
             * 改变为管理员角色
             */
            changeAdminRole(){
                this.loginUser.id=''
                this.loginUser.showName='admin'
                this.$router.push({
                    path: '/tenantManagement',
                    name: 'tenantManagement',
                })
            }
        },
        mounted(){
//            this.nowRoutePath = this.$route.name
//            this.initBreadcrumb(this.nowRoutePath)
        },
        watch: {
            $route: {
                handler: function (val, oldVal) {
//                    this.nowRoutePath = val.name
//                    this.initBreadcrumb(this.nowRoutePath)
                },
                // 深度观察监听
                deep: true
            }
        }
    }
</script>

<style scoped lang="less">
    .navbar {
        padding: 10px 15px;
        border-bottom: 1px solid #e7eaec;
    }

    .search-input {
        float: left;
        display: inline-table;
        width: 90%;
    }
    .el-button--mini, .el-button--mini.is-round{
        padding:3px 8px;
    }
    .el-breadcrumb{
        margin-top: 3px;
    }
</style>
