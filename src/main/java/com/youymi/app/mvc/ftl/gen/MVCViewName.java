/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.youymi.app.mvc.ftl.gen;

/**
 * 视图名枚举，请使用当前目录的GenerateMVCViewName类自动更新本枚举类。 <br/> <br/> 枚举条目定义规则如下: <br/> 视图名：/framework/common/view.ftl ===》
 * FRAMEWORK_COMMON_VIEW("/framework/common/view") <br/> <br/> <b>注意:</b> 如果视图名包含<b>'-'</b>, 那么该字符自动忽略。例如： <br/>
 * 视图名：/framework/common/xxx-view.ftl ===》 FRAMEWORK_COMMON_XXXVIEW("/framework/common/xxx-view")
 *
 * @author Yuanjun.Li
 * @author Liyuan Li
 *
 */
public enum MVCViewName {

    // @#############
	COMMON_BASEPAGE("/common/basePage"),
	COMMON_PUREBASEPAGE("/common/pureBasePage"),
	COMMON_STATICMACRO("/common/staticMacro"),
	ERRORS_403("/errors/403"),
	ERRORS_404("/errors/404"),
	ERRORS_500("/errors/500"),
	ERRORS_ERROR("/errors/error"),
	PGM_COMMON_ABOUT("/pgm/common/about"),
	PGM_COMMON_FOOTER("/pgm/common/footer"),
	PGM_COMMON_HEADER("/pgm/common/header"),
	PGM_COMMON_INDEX("/pgm/common/index"),
	PGM_COMMON_JPAGE("/pgm/common/jpage"),
	PGM_COMMON_JVALIDATE("/pgm/common/jvalidate"),
	PGM_COMMON_MENU("/pgm/common/menu"),
	PGM_COMMON_MODALPASSWORD("/pgm/common/modal-password"),
	PGM_COMMON_MODALSUGGESTION("/pgm/common/modal-suggestion"),
	PGM_COMMON_PGMCOMMON("/pgm/common/pgm-common"),
	PGM_COMMON_PGMMANAGE("/pgm/common/pgm-manage"),
	PGM_COMMON_PLACEHOLDER("/pgm/common/placeholder"),
	PGM_COMMON_PRIVIL("/pgm/common/privil"),
	PGM_COMMON_VALIDATOR("/pgm/common/validator"),
	PGM_COMMON_ZTREE("/pgm/common/ztree"),
	PGM_CUSTOMER_CUSTOMERROW("/pgm/customer/customer-row"),
	PGM_CUSTOMER_FORM("/pgm/customer/form"),
	PGM_CUSTOMER_INDEX("/pgm/customer/index"),
	PGM_CUSTOMER_MODAL_MDVIEWFORM("/pgm/customer/modal/md-view-form"),
	PGM_CUSTOMER_VIEWFORM("/pgm/customer/view-form"),
	PGM_ORGANIZATION_INDEX("/pgm/organization/index"),
	PGM_USER_DIALOGROLE("/pgm/user/dialog-role"),
	PGM_USER_FORM("/pgm/user/form"),
	PGM_USER_INDEX("/pgm/user/index"),
	PGM_USER_LOGINTIMEOUT("/pgm/user/login-timeout"),
	PGM_USER_LOGIN("/pgm/user/login"),
	PGM_USER_NEWLOGIN("/pgm/user/new-login"),
	PGM_USER_PASSWORDFORM("/pgm/user/password-form"),
	PGM_USER_ROLEASSIGN("/pgm/user/role-assign"),
	PGM_USER_SUGGESTIONFORM("/pgm/user/suggestion-form"),
	TEST("/test"),
	UPDATENOTE("/update-note");
// @#############

    // 成员变量
    private String viewName;

    // 构造方法
    private MVCViewName(String viewName) {
        this.viewName = viewName;
    }

    // 覆盖方法
    @Override
    public String toString() {
        return this.viewName;
    }
}
