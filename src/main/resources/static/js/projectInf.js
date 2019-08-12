$(".project_inf_submit").click(function () {
    var name=$("#project_name").val();
    var type=$("#project_type").val();
    var beginTime=$("#project_begin_time").val();
    var endTime=$("#project_end_time").val();
    var introduce=$("#project_introduce").val();
    var createPerson=$("#project_create_person").val();
    var status=$("#project_status").val();
    var projectInf={
        "name":name,
        "beginTime":beginTime,
        "endTime":endTime,
        "createPerson":createPerson,
        "type":type,
        "introduce":introduce,
        "status":status
    }
    $.ajax({
        type:"post",
        url:"/addProjectInf",
        data:JSON.stringify(projectInf),
        contentType:"application/json;charset=UTF-8",
        success:function (data) {
            alert(data);
        },
        error:function () {
            alert("传输失败");
        }
    })

})