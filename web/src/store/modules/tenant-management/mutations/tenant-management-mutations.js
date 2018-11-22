
const mutations = {
    /**
     * 获取租户列表
     * @param state
     * @param datas
     * @constructor
     */
    GET_TENANT_LIST(state, datas){
        if(datas.data.content){
            state.tenantList=datas.data.content
        }else{
            state.tenantList=[]
        }
    }
}

export default mutations

