var currentPage=0;
var pageSize=3;
var page={"currentPage":currentPage,"pageSize":pageSize}
var projectData;
$.ajax({
    type:"post",
    url:"/queryProjectInf",
    contentType:"application/json;charset=UTF-8",
    data:JSON.stringify(page),
    async:false,
    dataType:"json",
    success:function (data) {
        projectData=data;
        for(var i=0;i<pageSize;i++) {
            $(".content_right_content").append(" <div class=\"project_msg\">\n" +
                "       \n" +
                "        <div class=\"project_msg_head\">\n" +
                "            <p class=\"project_msg_name\"><a href=\"projectVersion.html\" class=\"project_version\">"+data.content[i].name+"</a></p>\n" +
                "            <div class=\"project_msg_time\">\n" +
                "                <span class=\"project_msg_beginTime\">开始日期:"+data.content[i].beginTime+"</span>\n" +
                "                <span>|</span>\n" +
                "                <span class=\"project_msg_endTime\">截止日期:"+data.content[i].endTime+"</span>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <p class=\"project_introduce\"><a href=\"projectInfShow.html\" class=\"project_inf\">"+data.content[i].introduce+"</a></p>\n" +
                "        <div class=\"project_msg_end\">\n" +
                "            <span class=\"project_msg_end_span\">创建者:</span><span class=\"project_msg_end_inf\">"+data.content[i].createPerson+"</span>\n" +
                "            <span class=\"project_msg_end_span\">状态:</span><span class=\"project_msg_end_inf\">"+data.content[i].status+"</span>\n" +
                "        </div>\n" +
                "    </div>")
        }

    },
    error:function () {
        alert("失败")
    }
})

var count;
$.ajax(
    {
        type:"post",
        url:"/getCount",
        dataType:"json",
        async:false,
        success:function (data) {
            count=data;
        },
        error:function () {
            alert("传输失败");
        }
    }
)
var maxPage=count/pageSize;
$(".nextPage").click(function () {

   if(currentPage>=maxPage)
   {
       alert("已经是最后一页了")
   }
   else {
       $(".content_right_content").html("<div class=\"all_project_head\">\n" +
           "        <span>所有项目</span>\n" +
           "        <div class=\"search_bg\"><input><button class=\"search\">搜索</button></div>\n" +
           "    </div>");
       currentPage++;

       var page = {"currentPage": currentPage, "pageSize": pageSize}
       $.ajax({
           type: "post",
           url: "/queryProjectInf",
           contentType: "application/json;charset=UTF-8",
           data: JSON.stringify(page),
           dataType: "json",
           success: function (data) {
               for (var i = 0; i < pageSize; i++) {
                   $(".content_right_content").append(" <div class=\"project_msg\">\n" +
                       "       \n" +
                       "        <div class=\"project_msg_head\">\n" +
                       "            <p class=\"project_msg_name\"><a href=\"projectVersion.html\" class=\"project_version\">" + data.content[i].name + "</a></p>\n" +
                       "            <div class=\"project_msg_time\">\n" +
                       "                <span class=\"project_msg_beginTime\">开始日期:" + data.content[i].beginTime + "</span>\n" +
                       "                <span>|</span>\n" +
                       "                <span class=\"project_msg_endTime\">截止日期:" + data.content[i].endTime + "</span>\n" +
                       "            </div>\n" +
                       "        </div>\n" +
                       "        <p class=\"project_introduce\"><a href=\"projectInf.html\" class=\"project_inf\">" + data.content[i].introduce + "</a></p>\n" +
                       "        <div class=\"project_msg_end\">\n" +
                       "            <span class=\"project_msg_end_span\">创建者:</span><span class=\"project_msg_end_inf\">" + data.content[i].createPerson + "</span>\n" +
                       "            <span class=\"project_msg_end_span\">状态:</span><span class=\"project_msg_end_inf\">" + data.content[i].status + "</span>\n" +
                       "        </div>\n" +
                       "    </div>")
               }

           },
           error: function () {
               alert("失败")
           }
       })
   }
})
$(".prePage").click(function () {

   if(currentPage<=0)
   {
       alert("已经是第一页了")
   }
   else {
       $(".content_right_content").html("<div class=\"all_project_head\">\n" +
           "        <span>所有项目</span>\n" +
           "        <div class=\"search_bg\"><input><button class=\"search\">搜索</button></div>\n" +
           "    </div>");
       currentPage--;

       var page = {"currentPage": currentPage, "pageSize": pageSize}
       $.ajax({
           type: "post",
           url: "/queryProjectInf",
           contentType: "application/json;charset=UTF-8",
           data: JSON.stringify(page),
           async: true,
           dataType: "json",
           success: function (data) {
               for (var i = 0; i < pageSize; i++) {
                   $(".content_right_content").append(" <div class=\"project_msg\">\n" +
                       "       \n" +
                       "        <div class=\"project_msg_head\">\n" +
                       "            <p class=\"project_msg_name\"><a href=\"projectVersion.html\" class=\"project_version\">" + data.content[i].name + "</a></p>\n" +
                       "            <div class=\"project_msg_time\">\n" +
                       "                <span class=\"project_msg_beginTime\">开始日期:" + data.content[i].beginTime + "</span>\n" +
                       "                <span>|</span>\n" +
                       "                <span class=\"project_msg_endTime\">截止日期:" + data.content[i].endTime + "</span>\n" +
                       "            </div>\n" +
                       "        </div>\n" +
                       "        <p class=\"project_introduce\"><a href=\"projectInf.html\" class=\"project_inf\">" + data.content[i].introduce + "</a></p>\n" +
                       "        <div class=\"project_msg_end\">\n" +
                       "            <span class=\"project_msg_end_span\">创建者:</span><span class=\"project_msg_end_inf\">" + data.content[i].createPerson + "</span>\n" +
                       "            <span class=\"project_msg_end_span\">状态:</span><span class=\"project_msg_end_inf\">" + data.content[i].status + "</span>\n" +
                       "        </div>\n" +
                       "    </div>")
               }

           },
           error: function () {
               alert("失败")
           }
       })
   }
})
$(".project_inf").click(function () {
    var index=$(".project_inf").index(this);
    var projectName=projectData.content[index].name;
    sessionStorage.setItem("projectName",projectName);
})
$(".project_version").click(function () {
    var index=$(".project_version").index(this);
    var projectName=projectData.content[index].name;
    sessionStorage.setItem("projectName",projectName);
})