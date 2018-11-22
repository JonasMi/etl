//获得年月日      得到日期oTime
function formatTime (str) {
    let oDate = new Date(str),
        oYear = oDate.getFullYear(),
        oMonth = oDate.getMonth() + 1,
        oDay = oDate.getDate(),
        oHour = oDate.getHours(),
        oMin = oDate.getMinutes(),
        oSen = oDate.getSeconds(),
        oTime = oYear + '-' + getzf(oMonth) + '-' + getzf(oDay) + ' ' + getzf(oHour) + ':' + getzf(oMin) + ':' + getzf(oSen)//最后拼接时间
    return oTime
}

//补0操作
function getzf (num) {
    if (parseInt(num) < 10) {
        num = '0' + num
    }
    return num
}

function transformMsForDate (time, dateType) {
    let oDate = new Date(time),
        oYear = oDate.getFullYear(),
        oMonth = oDate.getMonth() + 1,
        oDay = oDate.getDate()
    if (dateType === 'yy') {
        return oYear
    } else if (dateType === 'mm') {
        return oYear + '-' + this.setTimeAddZero(oMonth)
    } else if (dateType === 'dd') {
        return oYear + '-' + this.setTimeAddZero(oMonth) + '-' + this.setTimeAddZero(oDay)
    }
}

export { formatTime, getzf, transformMsForDate }
