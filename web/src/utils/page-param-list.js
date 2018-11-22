const paramList = [
    {
        name: '基础资源',
        children: [{funName: ['Patient信息'], interfaceName: 'Hospital', bizIdField: '', menuName: '医疗机构信息'},
            {funName: ['Patient信息'], interfaceName: 'Department', bizIdField: '', menuName: '科室信息'},
            {funName: ['Patient信息'], interfaceName: 'Employee', bizIdField: '', menuName: '医务人员信息'},
            {funName: ['Patient信息'], interfaceName: 'Bed', bizIdField: '', menuName: '床位信息'},
            {funName: ['Patient信息'], interfaceName: 'Medication', bizIdField: '', menuName: '药品信息'},
            {funName: ['Patient信息'], interfaceName: 'ChargingItem', bizIdField: '', menuName: '收费项目信息'},
            {funName: ['Patient信息'], interfaceName: 'Clinictype', bizIdField: '', menuName: '号别信息'},
            {funName: ['Patient信息'], interfaceName: 'Schedule', bizIdField: '', menuName: '排班信息'},
            {funName: ['Patient信息'], interfaceName: 'Slot', bizIdField: '', menuName: '号源信息'},
            {funName:['Patient信息'] , interfaceName:'Patient', bizIdField: 'patientId', menuName: '患者信息'}]
    }
]

export default {
    paramList
}
