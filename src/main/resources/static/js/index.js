var currentPage=0;
var pageSize=1;
var page={"currentPage":currentPage,"pageSize":pageSize}
$.ajax({
    type:"post",
    url:"/queryProjectInf",
    contentType:"application/json;charset=UTF-8",
    data:JSON.stringify(page),
    async:false,
    dataType:"json",
    success:function (data) {
        for(var i=0;i<pageSize;i++) {
            $(".content_right").append(" <div class=\"project_msg\">\n" +
                "       \n" +
                "        <div class=\"project_msg_head\">\n" +
                "            <p class=\"project_msg_name\"><a href=\"projectVersion.html\" class=\"project_version\">"+data.content[i].name+"</a></p>\n" +
                "            <div class=\"project_msg_time\">\n" +
                "                <span class=\"project_msg_beginTime\">开始日期:"+data.content[i].beginTime+"</span>\n" +
                "                <span>|</span>\n" +
                "                <span class=\"project_msg_endTime\">截止日期:"+data.content[i].endTime+"</span>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <p class=\"project_introduce\"><a href=\"projectInf.html\" class=\"project_inf\">"+data.content[i].introduce+"</a></p>\n" +
                "        <div class=\"project_msg_end\">\n" +
                "            <span class=\"project_msg_end_span\">创建者:</span><span class=\"project_msg_end_inf\">"+data.content[i].createPerson+"</span>\n" +
                "            <span class=\"project_msg_end_span\">状态:</span><span class=\"project_msg_end_inf\">"+data.content[i].status+"</span>\n" +
                "        </div>\n" +
                "    </div>")
        }
        $(".content_right").append("<div class='pageFunction'><button class='nextPage'>下一页</button><button class='prePage'>上一页</button></div>")
    },
    error:function () {
        alert("失败")
    }
})
$(".nextPage").click(function () {
   $(".content_right").html("<div class=\"all_project_head\">\n" +
       "        <span>所有项目</span>\n" +
       "        <div class=\"search_bg\"><input><button class=\"search\">搜索</button></div>\n" +
       "    </div>");
   currentPage++;
    var page={"currentPage":currentPage,"pageSize":pageSize}
    $.ajax({
        type:"post",
        url:"/queryProjectInf",
        contentType:"application/json;charset=UTF-8",
        data:JSON.stringify(page),
        async:false,
        dataType:"json",
        success:function (data) {
            for(var i=0;i<pageSize;i++) {
                $(".content_right").append(" <div class=\"project_msg\">\n" +
                    "       \n" +
                    "        <div class=\"project_msg_head\">\n" +
                    "            <p class=\"project_msg_name\"><a href=\"projectVersion.html\" class=\"project_version\">"+data.content[i].name+"</a></p>\n" +
                    "            <div class=\"project_msg_time\">\n" +
                    "                <span class=\"project_msg_beginTime\">开始日期:"+data.content[i].beginTime+"</span>\n" +
                    "                <span>|</span>\n" +
                    "                <span class=\"project_msg_endTime\">截止日期:"+data.content[i].endTime+"</span>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "        <p class=\"project_introduce\"><a href=\"projectInf.html\" class=\"project_inf\">"+data.content[i].introduce+"</a></p>\n" +
                    "        <div class=\"project_msg_end\">\n" +
                    "            <span class=\"project_msg_end_span\">创建者:</span><span class=\"project_msg_end_inf\">"+data.content[i].createPerson+"</span>\n" +
                    "            <span class=\"project_msg_end_span\">状态:</span><span class=\"project_msg_end_inf\">"+data.content[i].status+"</span>\n" +
                    "        </div>\n" +
                    "    </div>")
            }
            $(".content_right").append("<div class='pageFunction'><button class='nextPage'>下一页</button><button class='prePage'>上一页</button></div>")
        },
        error:function () {
            alert("失败")
        }
    })

})