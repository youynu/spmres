<#include 'modal-password.ftl'>
<#include 'modal-suggestion.ftl'>
<div class="navbar navbar-inverse navbar-fixed-top">
  <div class="navbar-inner">
    <div class="container">
 
      <!-- .btn-navbar is used as the toggle for collapsed navbar content -->
      <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>
 
      <!-- Be sure to leave the brand out there if you want it shown -->
      <a class="brand" href="#">贵研资源</a>
 
      <!-- Everything you want hidden at 940px or less, place within here -->
      <div class="nav-collapse collapse">
        <!-- .nav, .navbar-search, .navbar-form, etc -->
        <ul class="nav pull-right">
                      <li><a href="javascript:;;">${(currentUser.userName)!}</a></li>
                      <li class="divider-vertical"></li>
                      <li class="dropdown">
                        <a href="javascript:;;" class="dropdown-toggle" data-toggle="dropdown">操作<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                          <li><a href="${servePath}/login/loginOut">退出系统</a></li>
                          <li><a href="#"
                          	data-backdrop='static'  data-toggle="modal" 
						 	data-target="#passwordModal"
						 	data-remote='${servePath}/user/passwordform?gotimeoutpage=true&userId=${(item.id)!}'>修改密码</a></li>
                          
                          <li class="divider"></li>
                          <li><a href="#"
                           	data-backdrop='static'  data-toggle="modal" 
						 	data-target="#suggestionModal"
						 	data-remote='${servePath}/user/suggestionform?gotimeoutpage=true&userId=${(item.id)!}'>给出您的宝贵意见</a></li>
                        </ul>
                      </li>
           </ul>
      </div>
 
    </div>
  </div>
</div>