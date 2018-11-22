const mutations = {
    /**
     * * 点击菜单按钮，导航收缩放大
     * @param state
     * @constructor
     */
    TOGGLE_MENU (state) {
        state.smallMenu = !state.smallMenu
    },
    /**
     * 初始化面包屑
     * @param state
     * @param routeName
     * @constructor
     */
    INIT_BREADCRUMB(state, routeName){
        state.breadBeforeList = []
        state.breadList = []
        const init = {
            'tenantManagement': () => {
                state.breadBeforeList.push({name: '租户管理'})
                state.breadList.push({name: '租户列表', value: 'tanantList'})
            },
            'credentialsManagement': () => {
                state.breadBeforeList.push({name: '凭证'})
                state.breadBeforeList.push({name: '凭证管理'})
                state.breadList.push({name: '凭证列表', value: 'credentialList'})
            },
            'messageList': () => {
                state.breadBeforeList.push({name: '消息'})
                state.breadBeforeList.push({name: '消息列表'})
                state.breadList.push({name: '消息列表', value: 'messageList'})
            },
            'sentReference': () => {
                state.breadBeforeList.push({name: '消息'})
                state.breadBeforeList.push({name: '待发送引用'})
                state.breadList.push({name: '引用列表', value: 'referenceList'})
            },
            'adminConfig': () => {
                state.breadBeforeList.push({name: '运行管理'})
                state.breadBeforeList.push({name: '管理员配置'})
                state.breadList.push({name: '配置列表', value: 'adminConfigList'})
            },
            'tenantConfig': () => {
                state.breadBeforeList.push({name: '运行管理'})
                state.breadBeforeList.push({name: '租户配置'})
                state.breadList.push({name: '配置列表', value: 'tenantConfigList'})
            }
        }
        init[routeName]()
        if (state.breadList.length) {
            state.breadShow = routeName + '_' + state.breadList[0].value
        }
    },
    /**
     * 设置当前点击的面包屑
     * @param state
     * @param bareadShowName
     * @constructor
     */
    SET_NOW_BREADCUMB(state,bareadShowName){
        state.breadShow = bareadShowName
    }
}

export default mutations

