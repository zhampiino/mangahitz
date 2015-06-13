/*$(document).ready(function () {

    $('.btn-layout-view a').on('click', function (e) {
        if ($(this).hasClass('grid')) {
            event.preventDefault();
            setGetParameter('view','grid')
        }
        else if ($(this).hasClass('list')) {
            event.preventDefault();
            setGetParameter('view', 'list')
        }
    });

    var layoutView = getUrlParameter('view');
    var listClass = 'list-view col-sm-12 col-lg-12 col-md-12';
    var gridClass = 'grid-view col-sm-4 col-lg-4 col-md-4';

    if (layoutView) {

        $('.btn-layout-view a.'+layoutView).addClass('active');

        if (layoutView == 'grid') {
            $('.layout-view .item').removeClass(listClass);
            $('.layout-view .item').addClass(gridClass);
            $('.layout-view').hide().fadeIn('slow');
        }
        else if (layoutView == 'list') {
            $('.layout-view .item').removeClass(gridClass);
            $('.layout-view .item').addClass(listClass);
            $('.layout-view').hide().fadeIn('slow');
        }
    }

});

function getUrlParameter(sParam) {
    var sPageURL = window.location.search.substring(1);
    var sURLVariables = sPageURL.split('&');
    for (var i = 0; i < sURLVariables.length; i++) {
        var sParameterName = sURLVariables[i].split('=');
        if (sParameterName[0] == sParam) {
            return sParameterName[1];
        }
    }
}

function setGetParameter(paramName, paramValue) {
    var url = window.location.href;
    if (url.indexOf(paramName + "=") >= 0) {
        var prefix = url.substring(0, url.indexOf(paramName));
        var suffix = url.substring(url.indexOf(paramName));
        suffix = suffix.substring(suffix.indexOf("=") + 1);
        suffix = (suffix.indexOf("&") >= 0) ? suffix.substring(suffix.indexOf("&")) : "";
        url = prefix + paramName + "=" + paramValue + suffix;
    }
    else {
        if (url.indexOf("?") < 0)
            url += "?" + paramName + "=" + paramValue;
        else
            url += "&" + paramName + "=" + paramValue;
    }
    window.location.href = url;
}





*/