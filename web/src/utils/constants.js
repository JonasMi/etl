const archiveConfirm = {
    content: '确定要归档吗？',
    title: '请确认',
    ok: '确定',
    cancel: '取消',
    type: 'warning'

}
const deleteConfirm = {
    content: '确定要删除吗？删除以后将不再恢复',
    title: '请确认',
    ok: '确定',
    cancel: '取消',
    type: 'warning'

}
const cdrRules = {
    config: {
        baseUrl: [{required: true, message: '不能为空', trigger: 'blur'}],
        callBackUrl: [{required: true, message: '不能为空', trigger: 'blur'}],
        cacheConsumerPoolSize: [{ required: true, pattern: /^(?!0)[0-9]*$/, message: '请输入大1的数字，不能为空', trigger: 'blur'}],
    }
}
// const nestRules = {
//     config: {
//         exchangeName: [{required: true, message: '不能为空', trigger: 'blur'}],
//         serverIp: [{required: true, message: '不能为空', trigger: 'blur'}],
//         pattern: [{required: true, message: '不能为空', trigger: 'change'}],
//         messageConsumerPoolSize: [{pattern: /^(?!0)[0-9]*$/, required: true, message: '请输入大1的数字，不能为空', trigger: 'blur'}],
//     }
// }
// const adminConfigRules = {
//     config: {
//         exchangeName: [{required: true, message: '不能为空', trigger: 'blur'}],
//         running: [{required: true, message: '不能为空', trigger: 'blur'}],
//         consumerPoolSize:[{pattern: /^(?!0)[0-9]*$/,required: true, message: '请输入大1的数字，不能为空', trigger: 'blur'}],
//     }
// }
export default {
    etlUrl: 'http://192.168.2.2:8091/api',
    etlTableFieldUrl: 'http://192.168.2.83:8091/api',
    archiveConfirm,
    deleteConfirm,
    cdrRules,

}
