/**
 * Created by hewu on 2016/2/27 0027.
 */
requirejs.config({
    //定义requre加载的根目录
    baseUrl: "/nm/static/lib",
    //css加载（需要依赖require的css.js）
    map: {
        "*": {
            'css': 'require-css/css'
        }
    },
    //定义模块间的依赖
    shim: {
        // foundation: {
        //     deps: [
        //         "jquery", "css!../css/foundation/foundation.css", "css!../css/nm-nav.css", "css!../css/foundation/normalize.css","css!../css/common.css"
        //     ]
        // },
        slick: {
            deps: [
                "jquery", "css!../lib/slick/slick.css", "css!../lib/slick/slick-theme.css"
            ]
        }
    },
    //模块定义
    paths: {
        "jquery": "jquery-1.9.1",
        "util": "../module/util",
        // "foundation": "foundation/foundation.min",
        "domReady": "domReady/domReady",
        "slick": "slick/slick"

    }
});
// //入口加载
// requirejs(['jquery', "util", "foundation", "slick", "domReady"], function ($, util, f, slick, ready) {
//     //首页模块加载
//     //轮播插件
//     ready(function () {
//         $('.autoplay').slick({
//             lazyLoad: 'ondemand',
//             dots: true,
//             infinite: true,
//             speed: 500,
//             slidesToShow: 1,
//             slidesToScroll: 1,
//             autoplay: true,
//             autoplaySpeed: 2000
//         });
//
//     });
// });
//入口加载
requirejs(['jquery', "util", "slick", "domReady"], function ($, util, slick, ready) {
    //首页模块加载
    //轮播插件
    // ready(function () {
    //     $('.autoplay').slick({
    //         lazyLoad: 'ondemand',
    //         dots: true,
    //         infinite: true,
    //         speed: 500,
    //         slidesToShow: 1,
    //         slidesToScroll: 1,
    //         autoplay: true,
    //         autoplaySpeed: 2000
    //     });
    //
    // });
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


