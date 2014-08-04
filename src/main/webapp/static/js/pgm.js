!function($) {
	
	
	var  handleAjax = function(data) {
		if (data.succeed) {
			alert(data.msg);

			window.location.reload();
		} else {
			if (data.msg) {
				alert(data.msg);
			} else {
				alert("出错了,亲...");
			}
		}
	};

	var doAajx = function(actionUrl, formSel, paramData, handler) {
		var param = "";
		
		if (formSel) {
			 param += $(formSel).serialize();
		}
		if(paramData) {
			if (param.length > 0) {
				param = "&"+paramData;
			}else {
			param += paramData;
			}
		}

		$.ajax({
			url : actionUrl,
			type : 'POST',
			data : param+"&ajax=true"
		}).done(function(data) {
			if (handler) {
				handler(data);
				return; 
			}
			handleAjax(data);

		}).fail(function(jqXHR, error) {
			alert("出错了...");

		});
	};
	
	var commonSearchHandler = function (data) {
		if (data.code && data.code == 805) {
			alert(data.msg);
			return;
		}
		$(".j-common-table").html(data);
		jpaeInit();
	};
	
	
	
	$(document).on('keyup', '.j-common-search', function() {
		var url = webCfg.servePath + $(this).data("module");
		doAajx(url,false,"customerName="+$(this).val(),commonSearchHandler);

	});
	
	

	$(document).on('click', '.j-common-save', function() {		
		
		$('.j-validate-form').trigger("validate");

		var v = $('.j-validate-form').validator().data('validator');
		
		var isValid = v.isFormValid();
		 
		 
		if (isValid == false) {
			//验证失败
			
			//alert("请检查表单信息（不正确项）");
			return ;
		} 
		
		var url = webCfg.servePath + $(this).data("module");
		var simClass =  $(this).data("class");
		if (simClass) {
		doAajx(url,".j-common-form"+simClass);
		} else {
			doAajx(url,".j-common-form");
		}

	});
	
	$(document).on('click', '.j-common-delete', function() {
		
		if (confirm("确定删除此记录!")) {
		var url = webCfg.servePath + $(this).data("module");
		doAajx(url,false,"id="+$(this).data("id"));
		}
		
	});

	$(document).on('click', '.j-user-save', function() {
		
		$('.j-validate-form').trigger("validate");

		var v = $('.j-validate-form').validator().data('validator');
		
		var isValid = v.isFormValid();
		 
		 
		if (isValid == false) {
			//验证失败
			
			//alert("请检查表单信息（不正确项）");
			return ;
		} 
		
		
		var param = $(".j-user-form").serialize();
		$.ajax({
			url : webCfg.servePath + '/user/save',
			type : 'POST',
			async : false,
			data : param + "&ajax=true"
		}).done(function(data) {

			handleAjax(data);

		}).fail(function(jqXHR, error) {
			alert("服务器出错了...亲 ...");

		});
	});

	$(document).on('click', '.j-user-delete', function() {

		if (confirm("确定删除此用户!")) {

			$.ajax({
				url : webCfg.servePath + '/user/delete',
				type : 'POST',
				data : "id=" + $(this).data("id") + "&ajax=true"
			}).done(function(data) {

				if (data.succeed) {
					alert(data.msg);

					window.location.reload();
				} else {
					if (data.msg) {
						alert(data.msg);
					} else {
						alert("出错了，亲");
					}
				}

			}).fail(function(jqXHR, error) {
				alert("出错了...");

			});

		}
	});

	/**
	 * 模态窗口 回调...
	 */
	$("#myModal,.j-modal").on("hidden", function() {
		$(this).removeData("modal");
	});
	
	$("#myModal,.j-modal").on("shown", function() {
		validationInit();
		//$(document).placehodler();
	});
	
	
	/**
	 * 分页初始化
	 * 
	 */
	 /* initiate plugin */
   var jpaeInit = function() { $("div.j-jpages").jPages({
      containerID : "j-table"
    });
   };

   $(document).ready(function() {
	   jpaeInit();
   });
  
   
   /**
    * 表单验证：
    * jquery validation engine
    */   
  var validationInit = function() {
		//$(".j-validate-form").validationEngine(); 
	};
	
   
}(window.jQuery);