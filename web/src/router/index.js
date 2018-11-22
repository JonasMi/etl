import Vue from 'vue'
import Router from 'vue-router'
import Content from '@/components/content'
import TenantManagement from '@/views/tanant-management/tenant-management.vue'
import MessageList from '@/views/message-list/message-list.vue'

Vue.use(Router);

export default new Router({
    // mode: "history",
    routes: [
        {path: '/', redirect: "/messageList/Patient"},
        {
            path: '/',
            name: 'admin',
            component: Content,
            children: [
                {
                    path: 'tenantManagement',
                    name: 'tenantManagement',
                    component: TenantManagement
                },
                // {funName:'hospital信息',interfaceName:'hospital',field:'',menuName:'医院机构信息2',id:2},
                {
                    path: 'messageList/:interfaceName',
                    component: MessageList
                },

            ]
        }
    ]
})
