import Vue from 'vue'
import Vuex from 'vuex'

import TenantManagementStates from './tenant-management/states/tenant-management-states.js'
import TenantManagementMutations from './tenant-management/mutations/tenant-management-mutations.js'
import TenantManagementActions from './tenant-management/actions/tenant-manangement-actions.js'

import CommonStates from './common/states/common-states.js'
import CommonMutations from './common/mutations/common-mutations.js'
import CommonActions from './common/actions/common-actions.js'

import MessageListStates from './message-list/states/message-list-states.js'
import MessageListMutations from './message-list/mutations/message-list-mutations.js'
import MessageListActions from './message-list/actions/message-list-actions.js'
Vue.use(Vuex)

const tenantManagement = {
    namespaced: true,
    state: TenantManagementStates,
    mutations: TenantManagementMutations,
    actions: TenantManagementActions
}

const common = {
    namespaced: true,
    state: CommonStates,
    mutations:CommonMutations,
    actions: CommonActions
}
const messageList = {
    namespaced: true,
    state: MessageListStates,
    mutations:MessageListMutations,
    actions: MessageListActions
}

const store = new Vuex.Store({
    // strict: true,
    modules: {
        tenantManagement,
        common,
        messageList

    }
})

export default store
