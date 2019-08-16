

var projectName=sessionStorage.getItem("projectName");
alert(projectName)
sessionStorage.clear();

var projectNameData={"projectName":projectName};
$.ajax({
    type:"post",
    url:"/getProjectInfByName",
    data:projectNameData,
    dataType:"json",
    success:function (data) {
        $("#project_name").html(data.name);
        $("#project_type").html(data.type);
        $("#project_begin_time").html(data.beginTime);
        $("#project_end_time").html(data.endTime);
        $("#project_status").html(data.status);
        $("#project_create_person").html(data.createPerson);
        $("#project_introduce").html(data.introduce);
    },
    error:function () {
        alert("传输失败");
    }
})
