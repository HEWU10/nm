/**
 * Created by hewu on 2016/2/27 0027.
 */
requirejs.config({
    //定义requre加载的根目录
    baseUrl: "static/lib",
    //css加载（需要依赖require的css.js）
    map: {
        "*": {
            'css': 'require-css/css'
        }
    },
    //定义模块间的依赖
    shim: {
        bootstrap: {
            deps: [
                "jquery", "css!boot/css/bootstrap.css", "css!../css/nm-nav.css", "css!boot/css/bootstrap-theme.css", "css!../css/common.css"
            ]
        }

    },
    //模块定义
    paths: {
        "jquery": "jquery-1.9.1",
        "domReady": "domReady/domReady",
        "bootstrap": "boot/js/bootstrap"

    }
});
//入口加载
requirejs(['jquery', "bootstrap", "domReady"], function ($, boot, ready) {
    //首页模块加载

    // 初始化首页加载模块
    ready(function () {
        var itemWidth = 0;
        var solidItemArray = [];
        $.each($("#topnav a"), function (index, object) {
            itemWidth += $(object)[0].scrollWidth + 40;
            console.log(itemWidth);
            if (itemWidth > 1000) {
                //将当前栏目后的所有栏目放入数据，等待遍历完成后进行构造
                solidItemArray.push(object);
            }
        });
        console.log(itemWidth);
        console.log(solidItemArray);
    });
});


