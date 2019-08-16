var projectName=sessionStorage.getItem("projectName");
var projectNameData={"projectName":projectName};
var projectVersionData;
$.ajax(
    {
       type:"post",
       url:"/queryProjectVersion",
       data:projectNameData,
       dataType:"json",
       async:false,
       success:function (data) {
       projectVersionData=data;
       },
       error:function () {
          alert("传输失败");
       }
    }
)
$(".project_version_title").html(projectVersionData.name);
$(".project_version_version").html(projectVersionData.version);
for (var i=0;i<projectVersionData.updatePerson.length;i++)
{
    $(".update_person_inf").append("  <p class=\"project_version_infP\">"+projectVersionData.updatePerson[i]+"<span class=\"delete_inf\"><i class=\"iconfont icon-jianhao\"></i></span></p>")
}
for (var i=0;i<projectVersionData.confirmPerson.length;i++)
{
    $(".confirm_person_inf").append("  <p class=\"project_version_infP\">"+projectVersionData.confirmPerson[i]+"<span class=\"delete_inf\"><i class=\"iconfont icon-jianhao\"></i></span></p>")
}
for(var i=0;i<projectVersionData.message.length;i++)
{
    $(".update_msg_inf").append("<p class=\"project_version_infP\">"+projectVersionData.message[i]+"<span class=\"delete_inf\"><i class=\"iconfont icon-jianhao\"></i></span></p>")
}
for(var i=0;i<projectVersionData.frontInf.length;i++)
{
    $(".front_update_inf").append("<p class='project_version_infP'>"+"<span>"+projectVersionData.frontInf[i].name+"</span>"+"<span class='front_inf_version'>"+projectVersionData.frontInf[i].frontVersion+"</span>"+"<span class=\"delete_inf\"><i class=\"iconfont icon-jianhao\"></i></span></p>")
    if(projectVersionData.frontInf[i].status==0)
    {
        $(".front_inf_version").eq(i).css("color","orange");
    }
    if(projectVersionData.frontInf[i].status==1)
    {
        $(".front_inf_version").eq(i).css("color","orangered");
    }
    if(projectVersionData.frontInf[i].status==2)
    {
        $(".front_inf_version").eq(i).css("color","green");
    }
}
$("#addUpdatePerson").click(function () {
   var updateName=prompt("请输入更新人姓名");
   var judge=false;
   for(var i=0;i<projectVersionData.updatePerson.length;i++)
   {
       if(updateName==projectVersionData.updatePerson[i])
       {
           judge=true;
       }
   }
   if(!judge&&updatePerson!=null&&updatePerson!="")
   {
       var version=projectVersionData.version;
       var updatePerson={"name":updateName,"projectInfName":projectName,"projectVersion":version};
       $.ajax({
           type:"post",
           url:"/insertUpdateP",
           contentType:"application/json;charset=utf-8",
           data:JSON.stringify(updatePerson),
           success:function (data) {
               alert(data);
               location.reload()
           },
           error:function () {
               alert("失败");
           }
       })
   }
   else {
       alert("请输入有效值！");
   }



})
$("#addConfirmPerson").click(function () {
    var confirmName=prompt("请输入确认人姓名");
    var judge=false;
    for(var i=0;i<projectVersionData.confirmPerson.length;i++)
    {
        if(confirmName==projectVersionData.confirmPerson[i])
        {
            judge=true;
        }
    }
    if(!judge&&confirmName!=null&&confirmName!="")
    {
        var version=projectVersionData.version;
        var confirmPerson={"name":confirmName,"projectInfName":projectName,"projectVersion":version};
        $.ajax({
            type:"post",
            url:"/insertConfirmP",
            contentType:"application/json;charset=utf-8",
            data:JSON.stringify(confirmPerson),
            success:function (data) {
                alert(data);
                location.reload();
            },
            error:function () {
                alert("失败");
            }
        })
    }
    else {
        alert("请输入有效值！");
    }
})
$("#addUpdateMsg").click(function () {
    var message=prompt("请输入更新信息");
    var judge=false;
    for(var i=0;i<projectVersionData.message.length;i++)
    {
        if(message==projectVersionData.message[i])
        {
            judge=true;
        }
    }
    if(!judge&&message!=null&&message!="")
    {
        var version=projectVersionData.version;
        var updateMsg={"message":message,"projectInfName":projectName,"projectVersion":version};
        $.ajax({
            type:"post",
            url:"/insertUpdateMsg",
            contentType:"application/json;charset=utf-8",
            data:JSON.stringify(updateMsg),
            success:function (data) {
                alert(data);
                location.reload();
            },
            error:function () {
                alert("失败");
            }
        })
    }
    else {
        alert("请输入有效值！");
    }
})
$("#addFrontUpdate").click(function () {
    $(".front_inf_add").css("display","block");
})
$(".front_inf_cancel").click(function () {
    $(".front_inf_add").css("display","none");
})
$(".front_inf_submit").click(function () {
    var name=$(".front_name input").val();
    var judge=false;
    for(var i=0;i<projectVersionData.frontInf.length;i++)
    {
        if(name==projectVersionData.frontInf[i].name)
        {
            judge=true;
        }
    }
    var address = $(".front_address input").val();
    var frontVersion = $(".front_version input").val();
    var status = $(".front_status input").val();
    if(name==""||address==""||frontVersion==""||status=="")
    {
        alert("请不要输入空值")
    }
    else {
        if (!judge) {
            $(".front_inf_add").css("display", "none");
            var projectInfName = projectName;
            var projectVersion = projectVersionData.version;
            var frontData = {
                "name": name,
                "address": address,
                "frontVersion": frontVersion,
                "status": status,
                "projectInfName": projectInfName,
                "projectVersion": projectVersion
            };
            $.ajax(
                {
                    type: "post",
                    url: "/insertFrontInf",
                    contentType: "application/json;charset=utf-8",
                    data: JSON.stringify(frontData),
                    success: function (data) {
                        alert(data);
                    },
                    error: function () {
                        alert("传输失败");
                    }
                }
            )
        } else {
            alert("请不要重复添加");
        }
    }
})