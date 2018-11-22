import Constants from '@/utils/constants.js'
import axios from 'axios'

const actions = {
    /**
     * 获取信息列表
     */
    getMessageList({}, param){
        let timeBegin = ''
        let timeEnd = ''
        if (param.search.time && param.search.time.length) {
            timeBegin = param.search.time[0].getTime()
            timeEnd =param.search.time[1].getTime()
        }
        const sendParam = '?size=' + param.search.size + '&page=' + param.search.page +
            '&timeBegin=' + timeBegin + '&timeEnd=' + timeEnd + '&status=' + param.search.status+'&bizId'+param.search.bizId
        let url = Constants.etlUrl + '/' + param.interfaceName + '/'
        url = url + sendParam
        return axios.get(url).then((datas) => {
            return datas
        })
    },
    /**
     * 获取历史记录信息
     * @param param
     */
    getHistories({}, param){
        const url = Constants.etlUrl + '/' + param.pageParam.interfaceName + '/' + param.uid + '/nest-requests/'
        return axios.get(url).then((datas) => {
            return datas
        })
    },
    /**
     * 获取信息详情
     */
    getMessageDetail({}, param){
        const url = Constants.etlUrl + '/' + param.pageParam.interfaceName + '/' + param.messageId + '/'
        return axios.get(url)
    },
    /**
     * 获取历史信息详情
     *   GET /api/Patient/{messageId}/nest-requests/{requestId}/
     * @param param
     * pageParam: this.pageParam, message: row
     */
    getHistoryDetail({}, param){
        const url = Constants.etlUrl + '/' + param.pageParam.interfaceName + '/' + param.message.parent_id + '/nest-requests/' + param.message.id + '/'
        return axios.get(url)
    },
    /**
     *删除信息
     * @param param
     * {pageParam:this.pageParam,id:row.uid}
     */
    deleteMessage({}, param){
        //TODO
        const url = Constants.etlUrl + '/' + param.pageParam.interfaceName + '/' + param.id + '/'
        return axios.get(url)
    },
    /**
     * 获取表结构字段
     * @param interfaceName
     */
    getTableField({},interfaceName){
        const url = Constants.etlTableFieldUrl + '/field' + interfaceName + '/'
        return axios.get(url)
    },
    /**
     * 发送消息 POST /api/Patient/{messageId}/send
     * @param param
     * {interfaceName:this.pageParam.interfaceName,id:hisId}
     */
    sendMessage({},param){
        const url = Constants.etlUrl +'/'+ param.interfaceName + '/'+param.id+'/send/'
        return axios.post(url)
    }
}

export default actions

