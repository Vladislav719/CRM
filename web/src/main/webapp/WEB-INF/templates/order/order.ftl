<#include "../mainTemplate.ftl">
<#macro m_body>
<script type="text/javascript">
    $(document).ready(function(){
        $(".check").click(function(){
            $("#recordModal").modal('show');
        });
    });

    $(function(){
        $('#formAddRecord').on('submit',function(e){
            e.preventDefault();
            var $form = $(this);
            var $target = $($form.attr('data-target'));

            $.ajax({
                type:$form.attr('method'),
                url:$form.attr('action'),
                data:$form.serialize(),

                success: function (data, status) {
                    alert(data);
                }
            });
        });
    });
</script>

<div class="modal fade" id="recordModal" tabindex="-1" role="dialog" aria-labelledby="recordModal" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&amp;times;</button>
                <h4 class="modal-title" id="myModalLabel">New Record</h4>
            </div>
            <div class="modal-body">
                <h3>Add New Record</h3>
                <form id="formAddRecord" class="form-horizontal" data-async data-target="#recordModal" action="add" method="POST">
                    <fieldset>
                        <label class="label" for="clientName">Client Name</label>
                        <input class="input-sm " type="text" name="clientName">
                        
                        <label class="label"  for="phone">Phone Number</label>
                        <input class="input-sm" type="tel" name="phone">

                        <label for="price">Price</label>
                        <input class="input-sm" name="price" type="number">

                        <label for="dateAt">Date</label>
                        <input type="date" name="dateAt" class="input-sm" />
                    </fieldset>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button form="formAddRecord" type="submit" class="btn btn-primary">Add record</button>
            </div>
        </div>
    </div>
</div>


<div class="container">
    <div class="row top-buffer">
        <div class="col-md-10 col-xs-8 col-sm-8">
            <#--search-->
            <div class="input-group">
                <input type="text" placeholder="Search" class=" form-control" />
                <span class="input-group-addon">
                    <i class="glyphicon glyphicon-search"></i>
                </span>
            </div>
        </div>
        <div class="col-md-2 col-xs-4 col-sm-4">
            <button  class="btn btn-success check"
                    data-toggle="modal">
                <span class="glyphicon glyphicon-plus"></span>
                Add Record
            </button>
        </div>
    </div>
    <div class="row top-buffer">
        <div class="table-responsive">
            <table class="table table-striped">
                <tr>
                    <th>
                        <i class="glyphicon glyphicon-tag"></i>
                        No.
                    </th>
                    <th>
                        <i class="glyphicon glyphicon-user"></i>
                        Client
                    </th>
                    <th>
                        <i class="glyphicon glyphicon-phone-alt"></i>
                        Phone
                    </th>
                    <th>
                        <i class="fa fa-rub fa-lg" ></i>
                        Price
                    </th>
                    <th>
                        <i class="glyphicon glyphicon-calendar"></i>
                        Date
                    </th>
                </tr>
                <#if orders?has_content>
                    <#list orders as order>
                        <tr>
                            <td>${order.id}</td>
                            <td>${order.clientName}</td>
                            <td>${order.phone}</td>
                            <td>${order.price} руб</td>
                            <td>${order.dateAt}</td>
                        </tr>
                    </#list>
                </#if>
            </table>
        </div>
    </div>
</div>



</#macro>
<@main
title="Orders"
customStyles=["/resources/css/bootstrap-tags.css", "/resources/css/modal-jschr.css"]
customScripts=["/resources/js/bootstrap-tags.js", "/resources/js/specskill.js", "/resources/js/autocomplete.js",  "/resources/js/uploadImage.js", "/resources/js/profile.js"]
/>