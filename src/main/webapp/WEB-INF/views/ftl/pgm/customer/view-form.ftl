<form class='j-common-form form-horizontal' action='${servePath}/user/save' method='post'>
  <input type="hidden" name="id" value="${(customer.id)!}">
  
     
     <div class="control-group">
    	<label class='control-label  ' for="customerName">客户名称</label>
    	 <div class="controls">
    	 <input readonly="readonly" type="text" id="customerName" name="customerName" value="${(customer.customerName)!}" placeholder="客户名称">
    	 </div>	
     </div>
     
      <div class="control-group">
	    <label class='control-label' for="customerAddress">客户地址</label>
	    <div class="controls">
	    <input readonly="readonly" type="text" class="" id="customerAddress" name='customerAddress' value="${(customer.customerAddress)!}" placeholder="客户地址">
	    </div>
    </div>
     
    <div class="control-group">
	    <label class='control-label' for="customerNo">客户编号</label>
	     <div class="controls">
	    <input readonly="readonly" type="text" id="customerNo" name="customerNo" value="${(customer.customerNo)!}" placeholder="客户编号">
	    </div>
    </div>
    <div class="control-group">
	    <label class='control-label' for="contrator">联系人</label>
	     <div class="controls">
	    <input readonly="readonly" type="text" id="contrator" name='contrator' value="${(customer.contrator)!}" placeholder="联系人">
	    </div>
    </div>
    
    <div class="control-group">
	    <label class='control-label' for="contratorPhone">联系人电话</label>
	      <div class="controls">
	    <input readonly="readonly" type="text" id="contratorPhone" name='contratorPhone' value="${(customer.contratorPhone)!}" placeholder="联系人电话">
	    </div>
	</div>
    
    <div class="control-group">
	    <label class='control-label' for="tel">座机号码</label>
	     <div class="controls">
	    <input readonly="readonly" type="text" id="tel" name='tel' value="${(customer.tel)!}" placeholder="座机号码">
	    </div>
    </div>
    
    <div class="control-group">
	    <label class='control-label' for="fax">传真</label>
	     <div class="controls">
	    <input readonly="readonly" type="text" id="fax" name='fax' value="${(customer.fax)!}" placeholder="传真">
	    </div>
    </div>
    
     <div class="control-group">
	    <label class='control-label' for="postcode">邮编</label>
	     <div class="controls">
	    <input readonly="readonly" type="text" id="postcode" name='postcode' value="${(customer.postcode)!}" placeholder="邮编">
	    </div>
    </div>
    <div class="control-group">
	    <label class='control-label' for="postAddress">邮寄地址</label>
	     <div class="controls">
	    <input readonly="readonly" type="text" id="postAddress" name='postAddress' value="${(customer.postAddress)!}" placeholder="邮寄地址">
	    </div>
    </div>
   
    
    <div class="control-group">
	    <label class='control-label' for="companyProp">企业性质</label>
	    <div class="controls">
	    <input readonly="readonly" type="text" class="" id="companyProp" name='companyProp' value="${(customer.companyProp)!}" placeholder="企业性质">
	    </div>
    </div>
    
     <div class="control-group">
	    <label class='control-label' for="bankName">开户行</label>
	    <div class="controls">
	    <input readonly="readonly" type="text" class="" id="bankName" name='bankName' value="${(customer.bankName)!}" placeholder="开户行">
	    </div>
    </div>
    
     <div class="control-group">
	    <label class='control-label' for="bankCardNo">开户行帐号</label>
	    <div class="controls">
	    <input readonly="readonly" type="text" class="" id="bankCardNo" name='bankCardNo' value="${(customer.bankCardNo)!}" placeholder="开户行帐号">
	    </div>
    </div>
    
    
    <div class="control-group">
	    <label class='control-label' for="regBalance">注册资本（万元）</label>
	    <div class="controls">
	    <input readonly="readonly" type="text"  id="regBalance" name='regBalance' value="${(customer.regBalance)!}" placeholder="注册资本（万元）">
	    </div>
    </div>
    
    <div class="control-group">
	    <label class='control-label' for="creditLevel"> 客户信用等级</label>
	    <div class="controls">
	    <input readonly="readonly" type="text"  id="creditLevel" name='creditLevel' value="${(customer.creditLevel)!}" placeholder=" 客户信用等级">
	    </div>
    </div>
   
   <div class="control-group">
	    <label class='control-label' for="maxCreditBalance"> 最大赊销额度（万元）</label>
	    <div class="controls">
	    <input readonly="readonly" type="text"  id="maxCreditBalance" name='maxCreditBalance' value="${(customer.maxCreditBalance)!}" placeholder="最大赊销额度（万元）">
	    </div>
    </div>
   
   <div class="control-group">
	    <label class='control-label' for="maxPayDay"> 最长付款期限（天）</label>
	    <div class="controls">
	    <input readonly="readonly" type="text"  id="maxPayDay" name='maxPayDay' value="${(customer.maxPayDay)!}" placeholder=" 最长付款期限（天）">
	    </div>
    </div>
   
	 <div class="control-group">
	    <label class='control-label' for="payType"> 付款方式</label>
	    <div class="controls">
	   <input readonly="readonly" type="text"  
	    id="payType" name='payType' value="${(customer.payType)!}" placeholder="付款方式">
	    </div>
    </div>
      
   
    
     <div class="control-group">
	    <label class='control-label' for="note">备注</label>
	    <div class="controls">
	    <textarea readonly="readonly" id="note" name='note' rows="3" class="">${(customer.note)!}</textarea>
	    </div>
    </div>
    
 
</form>