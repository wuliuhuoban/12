/*$('#menu .easyui-tree').tree({
 onClick: function(node){

 var tab = $('#tab').tabs('getTab', node.text);
 console.log(tab);

 if(!tab){
 //如果没有就创建
 $('#tab').tabs('add',{
 title: node.text,
 closable: true
 });

 }else{
 //如果有就选中
 $('#tab').tabs('select', node.text);
 }

 }
 });*/

/*var ttshop = {
    registerMenuEvent: function () {
        $('#menu .easyui-tree').tree({
            onClick: function (node) {
                console.log(node);
                var href = node.attributes.href;
                $('#tab').tabs('close', 1);
                $('#tab').tabs('add', {
                    title: node.text,
                    href: href,
                    closable: true
                });
            }
        });
    }
};*/

var wuliu = {

    //响应导航树上的动作

    registerMenuEvent: function () {
        var _this = this;
        $('#menu .easyui-tree').tree({
            onClick: function (node) {
                var href = node.attributes.href;
                _this.addTab(node.text,href);
            }
        });
    },
    //添加选项卡
    addTab:function(title,href){
        if($('#tab').tabs('exists',title)){
            $('#tab').tabs('select',title)
        }else{
            $('#tab').tabs('add', {
                title: title,
                href: href,//get请求
                closable: true
            });
        }
    },

    //关闭选项卡
    closeTab:function(title){
        $('#tab').tabs('close',title);
    }

};







