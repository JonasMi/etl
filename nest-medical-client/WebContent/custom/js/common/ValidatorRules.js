jQuery.validator.addMethod("phone", function(value, element) {
	var length = value.length;
	var mobile = /^(((13[0-9]{1})|(15[0-9]{1}))+\d{8})$/;
	return this.optional(element) || (length == 11 && mobile.test(value));
}, "请正确填写您的手机号码");
jQuery.validator.addMethod("password", function(value, element) {
	var password = /^[a-zA-Z]\w+$/;
	return this.optional(element) || password.test(value);
}, "密码必须以字母开头,只能包含字母、数字和下划线");
jQuery.validator.addMethod("username", function(value, element) {
	var username = /^[a-zA-Z][a-zA-Z0-9_]+$/;
	return this.optional(element) || username.test(value);
}, "用户名只能由字母、数字和\"_\"组成,且必须以字母开头");

jQuery.validator.addMethod("displayName", function(value, element) {
	var username = /^[\u4E00-\u9FA5A-Za-z0-9]+$/;
	return this.optional(element) || username.test(value);
}, "昵称只能使用中文、英文和数字组成");
jQuery.validator.addMethod("before", function(value, element, param) {
	var date = Date.parse(value);
	var otherValue = $(param).val();
	if (otherValue) {
		var otherDate = Date.parse(otherValue);
		var dif = date - otherDate;
		return this.optional(element) || dif < 0;
	}
	return true;
}, "时间过大");

jQuery.validator.addMethod("after", function(value, element, param) {
	var date = Date.parse(value);
	var otherValue = $(param).val();
	if (otherValue) {
		var otherDate = Date.parse(otherValue);
		var dif = date - otherDate;
		return this.optional(element) || dif > 0;
	}
	return true;
}, "时间过小");