import Constants from '@/utils/constants.js'
import axios from 'axios'

const actions = {
    /**
     * 获取租户列表
     */
    getTenantList({commit},search){
        // console.log(search.name)
        const url = Constants.coordinatorUrl+'/tenants/?size='+search.size+
            '&page='+(search.page-1)+'&cdrName='+search.cdrName.trim()+'&nestName='+search.nestName.trim()
        // const url = Constants.coordinatorUrl+'/tenants/'
        return axios.get(url).then((datas) => {
            commit('GET_TENANT_LIST',datas)
            return datas
        })
    },
    /**
     * 新增租户租户
     * @param tenantForm
     * @returns {*}
     */
    saveTenant ({}, tenantForm) {
        const url = Constants.coordinatorUrl+'/tenants/'
        return axios.post(url,tenantForm).then((datas) => {

            return datas
        })
    },
    /**
     * 保存编辑租户
     */
    saveEditTenant({}, tenantForm){
        const url = Constants.coordinatorUrl+'/tenants/'+tenantForm.identifier+'/'
        return axios.put(url,tenantForm).then((datas) => {
            return datas
        })
    },
    /**
     *根据文件获取秘钥
     */
    getcode({},file){
        const url = Constants.coordinatorUrl + '/attachments/'
        const config = {
            headers: {
                'Content-Type': 'multipart/form-data'
            }
        }
        let formData = new FormData()
        formData.append('file',file)
        console.log(file)
        return axios.post(url, formData, config).then((datas) => {
            return datas
        })
    },
    /**
     * 归档租户
     * @param tenantId
     */
    archiveTenant({},tenantId){
        const url = Constants.coordinatorUrl+'/tenants/'+tenantId+'/'
        return axios.delete(url).then((datas) => {
            return datas
        })
    }
}

export default actions

