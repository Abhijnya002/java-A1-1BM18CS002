<!DOCTYPE html>
<html lang='en' ng-app='CodeApp' xmlns:fb='http://ogp.me/ns/fb#' xmlns:og='http://ogp.me/ns#'>
<head>
<base href='/'>
<meta charset='utf-8'>
<meta content='IE=Edge,chrome=1' http-equiv='X-UA-Compatible'>
<meta content='width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no' name='viewport'>
<meta content='UOKWL9FDreUe8Z9juyL7NBjLaTNPluL1n3Zw7n9HLLI' name='google-site-verification'>
<meta content='Online editor and compiler' property='og:title'>
<meta content='website' property='og:type'>
<meta content='Paiza.IO is online editor and compiler. Java, Ruby, Python, PHP, Perl, Swift, JavaScript... You can use for learning programming, scraping web sites, or writing batch' property='og:description'>
<meta content='https://paiza.IO/' property='og:url'>
<meta content='https://paiza.io/assets/movie_title-aed88df2f448c0d69598876d1262bdc0.png' property='og:image'>
<meta content='!' name='fragment'>
<link rel="shortcut icon" type="image/x-icon" href="/images/favicon.ico" />
<title ng-bind-template='{{longTitle?longTitle:(  (title?title+&#39; | &#39;:&#39;&#39;)+&#39;Online editor and compiler&#39;  )}}'>
Online PHP/Java/C++... editor and compiler | paiza.IO
</title>
<meta content='{{description ? description : &#39;Paiza.IO is online editor and compiler. Java, Ruby, Python, PHP, Perl, Swift, JavaScript... You can use for learning programming, scraping web sites, or writing batch&#39;}}' name='description'>
<meta name="csrf-param" content="authenticity_token" />
<meta name="csrf-token" content="VI1F2AG5U2wEQy28+b2Z3A2cKvMrWSh6W7x1+MXjeM6XQRqsYdSFYlhZRXHEkHshk/2wb5GjVRj59jiG8xXwiA==" />
<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
<!--[if lt IE 9]>
<script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.1/html5shiv.js"></script>
<![endif]-->
<!-- = stylesheet_link_tag "http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" -->
<!-- = stylesheet_link_tag "http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" -->
<link rel="stylesheet" media="all" href="/assets/application-38a7672a4985e3e3c2336b70d83a0153.css" />
<link rel="apple-touch-icon-precomposed" type="image/png" href="/images/apple-touch-icon-144x144-precomposed.png" sizes="144x144" />
<link rel="apple-touch-icon-precomposed" type="image/png" href="/images/apple-touch-icon-114x114-precomposed.png" sizes="114x114" />
<link rel="apple-touch-icon-precomposed" type="image/png" href="/images/apple-touch-icon-72x72-precomposed.png" sizes="72x72" />
<link rel="apple-touch-icon-precomposed" type="image/png" href="/images/apple-touch-icon-precomposed.png" />
<link rel="shortcut icon" type="image/x-icon" href="/images/favicon.ico" />
<!-- Load jQuery before AngularJS to use jQuery with AngularJS -->
<script src="/assets/jquery-ccdc624a8843d58f3ce83ba0e8835749.js"></script>
<!-- AngularJS modules -->
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-messages.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-cookies.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-resource.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-route.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-animate.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-sanitize.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-touch.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/angular-i18n/1.2.15/angular-locale_en-us.js"></script>
<script src="/assets/locale/en-us-309108e8d2ae20c9fdbd311f4a2ccf6e.js"></script>
<script src="/assets/ng-infinite-scroll-9ffd426b56bb40f60dc9951c822d5da8.js"></script>
<script src="/assets/angularLocalStorage-2cf1e31d1faff838bc8f6a1e8a2459b0.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-utils/0.1.1/angular-ui-utils.min.js"></script>
<link rel="stylesheet" media="screen" href="//cdnjs.cloudflare.com/ajax/libs/owl-carousel/1.3.2/owl.carousel.css" />
<link rel="stylesheet" media="screen" href="//cdnjs.cloudflare.com/ajax/libs/owl-carousel/1.3.2/owl.theme.css" />
<script src="//cdnjs.cloudflare.com/ajax/libs/owl-carousel/1.3.2/owl.carousel.js"></script>
<!-- = javascript_include_tag "http://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.10.0/ui-bootstrap-tpls.js" -->
<!-- = javascript_include_tag "ui-bootstrap-tpls-0.11.0.js" -->
<script src="/assets/ui-bootstrap-tpls-2.3.2-91ab855c94f9822c74bca4b1c19e3189.js"></script>
<!-- = javascript_include_tag "//cdnjs.cloudflare.com/ajax/libs/ace/1.1.3/ace.js" -->
<!-- = javascript_include_tag "//cdn.jsdelivr.net/ace/1.1.6/min/ace.js" -->
<!-- = javascript_include_tag "//cdn.jsdelivr.net/ace/1.1.6/min/ext-language_tools.js" -->
<!-- = javascript_include_tag "/js/ace-20151029/ace.js" -->
<!-- = javascript_include_tag "/js/ace-20151029/ext-language_tools.js" -->
<!-- = javascript_include_tag "/js/ace-20160316/ace.js" -->
<!-- = javascript_include_tag "/js/ace-20160316/ext-language_tools.js" -->
<script src="/js/ace-20180719/ace.js"></script>
<script src="/js/ace-20180719/ext-language_tools.js"></script>
<script src="/js/ui-ace.js"></script>
<link rel="stylesheet" media="screen" href="/assets/split-pane-42c9dd90cdb2c30bf18755cd8aab23c7.css" />
<script src="/assets/split-pane-332265058e7a5f1bb0cb15f0575b850a.js"></script>
<script src="/assets/angular-split-pane-36c664f8ca5bf12036da29286b5719a6.js"></script>
<script src="/assets/jquery.terminal-0.8.8-4299c960f5c0ba516a5cfd0593c507aa.js"></script>
<link rel="stylesheet" media="screen" href="/assets/jquery.terminal-b6d4b11f642b9f283b1b62d02a78a23e.css" />
<script src="/assets/loading-bar-189b0aad32706ebd8aed712c6479cd80.js"></script>
<link rel="stylesheet" media="screen" href="/assets/loading-bar-3ac2926aed75deea6f717c371faf7dc5.css" />
<!-- = stylesheet_link_tag "http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" -->
<!-- = javascript_include_tag "http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css" -->
<!-- = javascript_include_tag "http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js" -->
<!-- = javascript_include_tag "//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-5417a9d527daa381" -->
<script src="/assets/application-596a06bc10899678e4e26c2f58256f86.js"></script>
<script src="/js/togetherjs-min.js"></script>
<!-- = javascript_include_tag "/js/togetherjs.js" -->
<script src="//cdnjs.cloudflare.com/ajax/libs/sweetalert/0.4.2/sweet-alert.min.js"></script>
<link rel="stylesheet" media="screen" href="//cdnjs.cloudflare.com/ajax/libs/sweetalert/0.4.2/sweet-alert.css" />
<script src="//cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment-with-locales.js"></script>
<script src="/assets/angular-busy-776baa9339f927aafb3f375b8af31ea2.js"></script>
<link rel="stylesheet" media="screen" href="/assets/angular-busy-cea25a4fc49b4568a474e2c0e91eb9b5.css" />


<link href='https://paiza.io/en' rel='canonical'>
<link href='https://paiza.io/en/' hreflang='en' rel='alternate'>
<link href='https://paiza.io/ja/' hreflang='ja' rel='alternate'>
<link href='https://paiza.io/es/' hreflang='es' rel='alternate'>
<link href='https://paiza.io/' hreflang='x-default' rel='alternate'>
<script>
  // Google Tag Manager
  (function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
  new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
  j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
  'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
  })(window,document,'script','dataLayer','GTM-TJQKTWM');
</script>
<script>
  window.current_user = {"id":42510,"username":"Abhijnya K G","image_url":"https://lh4.googleusercontent.com/-F6KMNN_c-d4/AAAAAAAAAAI/AAAAAAAAAAA/ACHi3redSf3HdK9o8zbk7soJfJktcgIqCg/s50/photo.jpg"}
  if(window.current_user){
    window.current_user.providers = [{"id":25342,"user_id":42510,"provider":"google_oauth2","uid":"112373458531990532260","name":"Abhijnya K G","token":"ya29.GltfB1ZUjrbRLEHigClQruNBOrDB8Ul2cgJdk6LA6NARj5NPeKSnt1HUb4_LcmWsMZo9IKKFrwtEbub_j_GuHvbFxpJHFma4VqLvRswGR2kRZQlIVVusB2M6VuZw","gender":null,"timezone":null,"image_url":"https://lh4.googleusercontent.com/-F6KMNN_c-d4/AAAAAAAAAAI/AAAAAAAAAAA/ACHi3redSf3HdK9o8zbk7soJfJktcgIqCg/s50/photo.jpg","locale":"en","location":null,"auth":"{\"provider\":\"google_oauth2\",\"uid\":\"112373458531990532260\",\"info\":{\"name\":\"Abhijnya K G\",\"email\":\"abhijnya.cs18@bmsce.ac.in\",\"first_name\":\"Abhijnya\",\"last_name\":\"K G\",\"image\":\"https://lh4.googleusercontent.com/-F6KMNN_c-d4/AAAAAAAAAAI/AAAAAAAAAAA/ACHi3redSf3HdK9o8zbk7soJfJktcgIqCg/s50/photo.jpg\"},\"credentials\":{\"token\":\"ya29.GltfB1ZUjrbRLEHigClQruNBOrDB8Ul2cgJdk6LA6NARj5NPeKSnt1HUb4_LcmWsMZo9IKKFrwtEbub_j_GuHvbFxpJHFma4VqLvRswGR2kRZQlIVVusB2M6VuZw\",\"refresh_token\":\"1/i2ABnzDOAPGixamnh5GcTxLqC_dgiVd2O55s25m31LjLy8nhXmQgbBghA2nc3ebq\",\"expires_at\":1565352625,\"expires\":true},\"extra\":{\"id_token\":\"eyJhbGciOiJSUzI1NiIsImtpZCI6IjM0OTRiMWU3ODZjZGFkMDkyZTQyMzc2NmJiZTM3ZjU0ZWQ4N2IyMmQiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJhY2NvdW50cy5nb29nbGUuY29tIiwiYXpwIjoiMTgxNTE5NTU1MTI4LTZyZjlycTg5MmU2b2RyMTU3aGNzNnJkdG44OHR2MjBvLmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwiYXVkIjoiMTgxNTE5NTU1MTI4LTZyZjlycTg5MmU2b2RyMTU3aGNzNnJkdG44OHR2MjBvLmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwic3ViIjoiMTEyMzczNDU4NTMxOTkwNTMyMjYwIiwiaGQiOiJibXNjZS5hYy5pbiIsImVtYWlsIjoiYWJoaWpueWEuY3MxOEBibXNjZS5hYy5pbiIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJhdF9oYXNoIjoiVUF0OFA5U3I0dHF5VTJzODdjRnowQSIsImlhdCI6MTU2NTM0OTAyNSwiZXhwIjoxNTY1MzUyNjI1fQ.Rim6pGnKyve9CZ6BHruNxPQhqYPHDIxauxfLIF7oDx9q0M6zTTk2-cflEfW82ZHDzT-1NStaxvsSAE1H1R0dPcEvDxddaIoyfoCZCeqgWjmbh6msXoVDtNrMqUA9_Uyxz0hIX2_KJmk9J2YuQa6T_Qq-DvE1rkjzOmiTWvyYKKMl2FV6k5-1fOAoUFQeT3bok7vlwTkslK2DcmagiNapzDZfmWcitmBBPabKUks39g5X0RsEo8LWDemBmxXEydQCaogL0mw2EoSp6u6pDfNgP-2OmDd1aBDJXIxVDSr1kPOsn9Gz8bDgdcJEHIPe1GQZUugxeUoLiKFz9BGHx8wYVw\",\"id_info\":{\"iss\":\"accounts.google.com\",\"azp\":\"181519555128-6rf9rq892e6odr157hcs6rdtn88tv20o.apps.googleusercontent.com\",\"aud\":\"181519555128-6rf9rq892e6odr157hcs6rdtn88tv20o.apps.googleusercontent.com\",\"sub\":\"112373458531990532260\",\"hd\":\"bmsce.ac.in\",\"email\":\"abhijnya.cs18@bmsce.ac.in\",\"email_verified\":true,\"at_hash\":\"UAt8P9Sr4tqyU2s87cFz0A\",\"iat\":1565349025,\"exp\":1565352625},\"raw_info\":{\"kind\":\"plus#personOpenIdConnect\",\"sub\":\"112373458531990532260\",\"name\":\"Abhijnya K G\",\"given_name\":\"Abhijnya\",\"family_name\":\"K G\",\"picture\":\"https://lh4.googleusercontent.com/-F6KMNN_c-d4/AAAAAAAAAAI/AAAAAAAAAAA/ACHi3redSf3HdK9o8zbk7soJfJktcgIqCg/s50/photo.jpg\",\"email\":\"abhijnya.cs18@bmsce.ac.in\",\"email_verified\":\"true\",\"locale\":\"en\",\"hd\":\"bmsce.ac.in\"}}}"}]
    window.current_user.policy = {"id":1,"name":"guest","max_source_code":100000,"max_input":100000,"max_build_time_limit":15,"max_time_limit":2,"max_memory_limit":512000000,"max_priority":0,"allow_network":true,"created_at":"2015-08-04T05:36:22.000Z","updated_at":"2015-08-04T05:36:22.000Z","max_stdout_limit":100000}
  }
  console.log("current_user=", current_user)
  window.app_locale = "en-us"
  window.app_locale_short = "en"
</script>
<script>
  window.$zopim||(function(d,s){var z=$zopim=function(c){z._.push(c)},$=z.s=
  d.createElement(s),e=d.getElementsByTagName(s)[0];z.set=function(o){z.set.
  _.push(o)};z._=[];z.set._=[];$.async=!0;$.setAttribute("charset","utf-8");
  $.src="//v2.zopim.com/?2yZ9OOc1wcz7iOrjG11V1OWGAM1aPwh7";z.t=+new Date;$.
  type="text/javascript";e.parentNode.insertBefore($,e)})(document,"script");
  
  $zopim(function() {
    $zopim.livechat.setLanguage(window.app_locale.substr(0,2));
    if(current_user){
      $zopim.livechat.setName(current_user.username);
      $zopim.livechat.setEmail(current_user.email);
    }
  });
</script>
<script>
  // hotjar (https://www.hotjar.com)
  // <!-- Hotjar Tracking Code for http://paiza.io/ -->
  (function(h,o,t,j,a,r){
  h.hj=h.hj||function(){(h.hj.q=h.hj.q||[]).push(arguments)};
  h._hjSettings={hjid:273669,hjsv:5};
  a=o.getElementsByTagName('head')[0];
  r=o.createElement('script');r.async=1;
  r.src=t+h._hjSettings.hjid+j+h._hjSettings.hjsv;
  a.appendChild(r);
  })(window,document,'//static.hotjar.com/c/hotjar-','.js?sv=');
</script>
<script>
  // Inspectlet (https://www.inspectlet.com)
  // <!-- Begin Inspectlet Embed Code -->
  window.__insp = window.__insp || [];
  __insp.push(['wid', 27194362]);
  (function() {
  function ldinsp(){if(typeof window.__inspld != "undefined") return; window.__inspld = 1; var insp = document.createElement('script'); insp.type = 'text/javascript'; insp.async = true; insp.id = "inspsync"; insp.src = ('https:' == document.location.protocol ? 'https' : 'http') + '://cdn.inspectlet.com/inspectlet.js'; var x = document.getElementsByTagName('script')[0]; x.parentNode.insertBefore(insp, x); };
  setTimeout(ldinsp, 500); document.readyState != "complete" ? (window.attachEvent ? window.attachEvent('onload', ldinsp) : window.addEventListener('load', ldinsp, false)) : ldinsp();
  })();
  // <!-- End Inspectlet Embed Code -->
</script>
<script>
  // mouseflow (https://mouseflow.com)
  var _mfq = _mfq || [];
    (function() {
      var mf = document.createElement("script");
      mf.type = "text/javascript"; mf.async = true;
      mf.src = "//cdn.mouseflow.com/projects/b2f6be73-5f2c-4f81-bd4b-15b190d646fa.js";
      document.getElementsByTagName("head")[0].appendChild(mf);
    })();
</script>
<script>
  // Mixpanel (https://mixpanel.com/)
  // <!-- start Mixpanel --><script type="text/javascript">
  (function(e,a){if(!a.__SV){var b=window;try{var c,l,i,j=b.location,g=j.hash;c=function(a,b){return(l=a.match(RegExp(b+"=([^&]*)")))?l[1]:null};g&&c(g,"state")&&(i=JSON.parse(decodeURIComponent(c(g,"state"))),"mpeditor"===i.action&&(b.sessionStorage.setItem("_mpcehash",g),history.replaceState(i.desiredHash||"",e.title,j.pathname+j.search)))}catch(m){}var k,h;window.mixpanel=a;a._i=[];a.init=function(b,c,f){function e(b,a){var c=a.split(".");2==c.length&&(b=b[c[0]],a=c[1]);b[a]=function(){b.push([a].concat(Array.prototype.slice.call(arguments,0)))}}var d=a;"undefined"!==typeof f?d=a[f]=[]:f="mixpanel";d.people=d.people||[];d.toString=function(b){var a="mixpanel";"mixpanel"!==f&&(a+="."+f);b||(a+=" (stub)");return a};d.people.toString=function(){return d.toString(1)+".people (stub)"};k="disable time_event track track_pageview track_links track_forms register register_once alias unregister identify name_tag set_config reset people.set people.set_once people.increment people.append people.union people.track_charge people.clear_charges people.delete_user".split(" ");
  
  for(h=0;h<k.length;h++)e(d,k[h]);a._i.push([b,c,f])};a.__SV=1.2;b=e.createElement("script");b.type="text/javascript";b.async=!0;b.src="undefined"!==typeof MIXPANEL_CUSTOM_LIB_URL?MIXPANEL_CUSTOM_LIB_URL:"file:"===e.location.protocol&&"//cdn.mxpnl.com/libs/mixpanel-2-latest.min.js".match(/^\/\//)?"https://cdn.mxpnl.com/libs/mixpanel-2-latest.min.js":"//cdn.mxpnl.com/libs/mixpanel-2-latest.min.js";c=e.getElementsByTagName("script")[0];c.parentNode.insertBefore(b,c)}})(document,window.mixpanel||[]);
  
  mixpanel.init("f56fede95c3a912e614e8c4e8ec6ec2b");
</script>
<script>
  // HEAP (https://heapanalytics.com/)
  window.heap=window.heap||[],heap.load=function(e,t){window.heap.appid=e,window.heap.config=t=t||{};var r=t.forceSSL||"https:"===document.location.protocol,a=document.createElement("script");a.type="text/javascript",a.async=!0,a.src=(r?"https:":"http:")+"//cdn.heapanalytics.com/js/heap-"+e+".js";var n=document.getElementsByTagName("script")[0];n.parentNode.insertBefore(a,n);for(var o=function(e){return function(){heap.push([e].concat(Array.prototype.slice.call(arguments,0)))}},p=["addEventProperties","addUserProperties","clearEventProperties","identify","removeEventProperty","setEventProperties","track","unsetEventProperty"],c=0;c<p.length;c++)heap[p[c]]=o(p[c])};
  heap.load("1680397002");
</script>
<meta data-csrf='QDfD0EMgOnt68DE0wS0aBQHlldvHEp3NdMPygMM0y/SD+5ykI03sdSbqWfn8APj4n4QPR33o4K/Wib/+9cJDsg==' id='csrf' ng-controller='CsrfCtrl'>
<style>
  .ng-cloak { display: none !important; }
</style>
</head>
<body ng-class='{embed: embed}'>
<!-- Google Tag Manager (noscript) -->
<noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-TJQKTWM"
height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>
<!-- End Google Tag Manager (noscript) -->
<div class='ng-cloak' ng-cloak>
<div id='fb-root'></div>
<script>
  (function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=632950816819414&version=v2.0";
    fjs.parentNode.insertBefore(js, fjs);
  }(document, 'script', 'facebook-jssdk'));
</script>
<div class='navbar navbar-default navbar-static-top' ng-hide='embed'>
<div class='ribbon'>
<a href='#'>
Beta
</a>
</div>
<div class='container'>
<button class='navbar-toggle' data-target='.navbar-responsive-collapse' data-toggle='collapse' type='button'>
<span class='icon-bar'></span>
<span class='icon-bar'></span>
<span class='icon-bar'></span>
</button>
<a class='navbar-brand' ng-href='{{languageId&amp;&amp;app_locale==&#39;en-us&#39;?&#39;/&#39;+app_locale_short+&#39;/languages/&#39;+languageId:&#39;/&#39;+app_locale_short+&#39;/&#39;}}' style='display: block; padding: 0 15px;'>
<span style='display: inline-block; height: 100%; vertical-align:middle;'></span>
<span ng-if='!(languageId&amp;&amp;app_locale==&#39;en-us&#39;)'>
<img alt='paiza.IO' height='32' src='/assets/paizaio_logo_s-9bd1bf73a17e2002f96a6337f2fb71f9.png' style='vertical-align:middle; padding:0; display: inline-block;' width='132'>
</span>
<span ng-if='languageId&amp;&amp;app_locale==&#39;en-us&#39;'>
<img alt='paiza.IO' height='16' src='/assets/paizaio_logo_s-9bd1bf73a17e2002f96a6337f2fb71f9.png' style='vertical-align:middle; padding:0; display: inline-block;' width='66'>
{{languageTitle}}
</span>
</a>
<div class='navbar-collapse collapse navbar-responsive-collapse'>
<ul class='nav navbar-nav' ng-controller='NavController'>
<li ng-class='{active: isActive(&#39;/projects/new&#39;)}'>
<a ng-href='/{{app_locale_short}}/projects/new?language={{languageId}}' ng-if='languageId'>
<b ng-if='app_locale != &quot;en-us&quot;'>
{{'navbar.newcode'|i18n}}
</b>
<b ng-if='app_locale == &quot;en-us&quot;'>
{{'navbar.new'|i18n}}
{{'navbar.code'|i18n}}
</b>
</a>
<a ng-href='/{{app_locale_short}}/projects/new' ng-if='!languageId'>
<b>
{{'navbar.newcode'|i18n}}
</b>
</a>
</li>
<li ng-class='{active: isActive(&#39;/projects&#39;)}' ng-if='app_locale == &quot;en-us&quot;'>
<a ng-href='/projects?language={{languageId}}' ng-if='languageId'>
{{'navbar.recent'|i18n}}
{{'navbar.code'|i18n}}
</a>
<a ng-href='/projects' ng-if='!languageId'>
{{'navbar.recentcode'|i18n}}
</a>
</li>
<li ng-class='{active: isActive(&#39;/projects&#39;)}' ng-if='app_locale != &quot;en-us&quot;'>
<a ng-href='/projects'>
{{'navbar.recentcode'|i18n}}
</a>
</li>
<li>
<a href='https://paiza.cloud/' target='_blank'>
{{'navbar.paizacloud'|i18n}}
<img height='16' src='https://paiza.cloud/assets/images/logo/paizacloud_logo_icontext_white.png'>
<div style='position: relative; display: inline-block; width: 0; height: 0; top: -12px; left: -30px; font-size: smaller;'>
<div style='background-color: #A8050F; color: white;width: 40px; padding: 0 5px; height: 17px;border-radius: 10px;'>
New!
</div>
</div>
</a>
</li>
</ul>
<ul class='nav navbar-nav navbar-right'>
<li>
<span class='dropdown' on-toggle='toggled(open)'>
<p class='navbar-text'>
<a class='navbar-link dropdown-toggle'>
English
<span class='caret'></span>
</a>
</p>
<ul class='dropdown-menu'>
<li>
<a onclick='javascript:location.href = location.href.split(/[?]/)[0] + &#39;?locale=&#39; + &#39;en-us&#39;' target='_top'>
English
</a>
</li>
<li>
<a onclick='javascript:location.href = location.href.split(/[?]/)[0] + &#39;?locale=&#39; + &#39;ja-jp&#39;' target='_top'>
日本語
</a>
</li>
<li>
<a onclick='javascript:location.href = location.href.split(/[?]/)[0] + &#39;?locale=&#39; + &#39;es-es&#39;' target='_top'>
Spanish
</a>
</li>
</ul>
</span>
</li>
<li>
<span class='dropdown dropdown_signed_in'>
<img class='dropdown-toggle' src='https://lh4.googleusercontent.com/-F6KMNN_c-d4/AAAAAAAAAAI/AAAAAAAAAAA/ACHi3redSf3HdK9o8zbk7soJfJktcgIqCg/s50/photo.jpg' style='width:50px; height:50px;'>
<ul class='dropdown-menu'>
<li>
Abhijnya K G
</li>
<li class='divider'></li>
<li>
<a href='/users/edit' target='_self'>
Edit profile
</a>
</li>
<li>
<a target="_top" class="signout" rel="nofollow" data-method="delete" href="/users/sign_out?authenticity_token=kBmAcvYiiBVURaazaAukwERxeCa%2BpVShCrWUebEVSFJT1d8Glk9eGwhfzn5VJkY92hDiugRfKcOo%2F9kHh%2BPAFA%3D%3D">Logout</a>
</li>
</ul>
</span>
</li>
<li>
<span class='dropdown' on-toggle='toggled(open)'>
<p class='navbar-text'>
<a class='navbar-link dropdown-toggle'>
<i class='glyphicon-question-sign glyphicon'></i>
</a>
</p>
<ul class='dropdown-menu'>
<li>
<a href='/help'>
Help
</a>
<a href='/feedback/index'>
Feedback/Contact
</a>
</li>
</ul>
</span>
</li>
</ul>
</div>
</div>
</div>
<div aria-hidden='true' aria-labelledby='myModalLabel' class='modal fade' id='signUpModal' role='dialog' tabindex='-1'>
<div class='modal-dialog'>
<div class='modal-content'>
<div class='modal-header'>
<button class='close' data-dismiss='modal' type='button'>
<span aria-hidden='true'>×</span>
<span class='sr-only'>Close</span>
</button>
<h4 class='modal-title' id='myModalLabel'>
Sign Up
</h4>
</div>
<div class='modal-body'>
<a class='btn btn-lg btn-primary' href='/users/auth/github' target='_self'>
<img height='32' src='/assets/github/Octocat-31ccba2be37bc3c9586160d86657907a.png' width='32'>
GitHub
Sign In
</a>
<hr>
<a class='btn btn-sm btn-primary' href='/users/auth/facebook' target='_self'>
<img height='16' src='/assets/facebook/FB-f-Logo__blue_512-d4621313ed8f7821fb23cf46553ad3df.png' width='16'>
Facebook
Sign In
</a>
<a class='btn btn-sm btn-primary' href='/users/auth/google_oauth2' target='_self'>
<img height='16' src='/assets/google/btn_google_light_normal_ios@3x-4960eaf9552bee055293ce4b9abec781.png' width='16'>
Google
Sign In
</a>
<hr>
<form name="signup_form" class="new_user" id="new_user" action="/users" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="mLutxUqj/wAJY7DfnqT8I637PSw5BHvNM8OB0+76m/xbd/KxKs4pDlV52BKjiR7eM5qnsIP+Bq+Ricyt2AwTug==" />
<div class='control-group mb5'>
<label class="control-label" for="user_username">Username</label>
<div class='controls'>
<input autofocus="autofocus" class="text_area" required="required" minlength="3" ng-model="username" type="text" name="user[username]" id="user_username" />
<span class='text-danger' ng-messages='signup_form[&#39;user[username]&#39;].$error'>
<span ng-message='required'>Required</span>
<span ng-message='minlength'>Too short(less than 3 characters)</span>
</span>
<span class='text-success' ng-show='signup_form[&#39;user[username]&#39;].$valid'>OK</span>
</div>
</div>
<div class='control-group mb5'>
<label class="control-label" for="user_email">E-mail</label>
<div class='controls'>
<input class="text_area" ng-model="email" required="required" type="email" value="" name="user[email]" id="user_email" />
<span class='text-danger' ng-messages='signup_form[&#39;user[email]&#39;].$error'>
<span ng-message='required'>Required</span>
<span ng-message='email'>Invalid E-Mail address</span>
</span>
<span class='text-success' ng-show='signup_form[&#39;user[email]&#39;].$valid'>OK</span>
</div>
</div>
<div class='control-group mb5'>
<label class="control-label" for="user_password">Password</label>
<div class='controls'>
<input autocomplete="off" class="text_area" ng-model="password" minlength="8" required="required" type="password" name="user[password]" id="user_password" />
<span class='text-danger' ng-messages='signup_form[&#39;user[password]&#39;].$error'>
<span ng-message='required'>Required</span>
<span ng-message='minlength'>Too short(less than 8 characters)</span>
</span>
<span class='text-success' ng-show='signup_form[&#39;user[password]&#39;].$valid'>OK</span>
</div>
</div>
<div class='mb15'>
<label for="user_password_confirmation">Password confirmation</label>
<br>
<input autocomplete="off" ng-model="password_confirmation" minlength="8" required="required" ui-validate="&#39;$value==password&#39;" ui-validate-watch="&#39;password&#39;" type="password" name="user[password_confirmation]" id="user_password_confirmation" />
<span class='text-danger' ng-messages='signup_form[&#39;user[password_confirmation]&#39;].$error'>
<span ng-message='required'>Required</span>
<span ng-message='validator'>Password does not match.</span>
</span>
<span class='text-success' ng-show='signup_form[&#39;user[password_confirmation]&#39;].$valid'>OK</span>
</div>
<div><input type="submit" name="commit" value="Sign Up" class="btn btn-primary" ng-disabled="signup_form.$invalid" /></div>
</form><a target="_blank" href="/users/password/new">Forgot your password?</a>
<br>
<a target="_blank" href="/users/confirmation/new">Didn&#39;t receive confirmation instructions?</a>
<br>

<hr>
<div style='font-size: x-small'>

</div>
</hr>

</div>
</div>
</div>
</div>
<div aria-hidden='true' aria-labelledby='myModalLabel' class='modal fade' id='signInModal' role='dialog' tabindex='-1'>
<div class='modal-dialog'>
<div class='modal-content'>
<div class='modal-header'>
<button class='close' data-dismiss='modal' type='button'>
<span aria-hidden='true'>×</span>
<span class='sr-only'>Close</span>
</button>
<h4 class='modal-title' id='myModalLabel'>
Sign In
</h4>
</div>
<div class='modal-body'>
<a class='btn btn-lg btn-primary' href='/users/auth/github' target='_self'>
<img height='32' src='/assets/github/Octocat-31ccba2be37bc3c9586160d86657907a.png' width='32'>
GitHub
Sign In
</a>
<hr>
<a class='btn btn-sm btn-primary' href='/users/auth/facebook' target='_self'>
<img height='16' src='/assets/facebook/FB-f-Logo__blue_512-d4621313ed8f7821fb23cf46553ad3df.png' width='16'>
Facebook
Sign In
</a>
<a class='btn btn-sm btn-primary' href='/users/auth/google_oauth2' target='_self'>
<img height='16' src='/assets/google/btn_google_light_normal_ios@3x-4960eaf9552bee055293ce4b9abec781.png' width='16'>
Google
Sign In
</a>
<hr>
<form name="signin_form" class="new_user" id="new_user" action="/users/sign_in" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="8vZzf5Ax5Zx3B0ByRjuq7c22aLjT99AiS9BiG4wHnMYxOiwL8FwzkisdKL97FkgQU9fyJGkNrUDpmi9luvEUgA==" /><div class='control-group'>
<label class="control-label" for="user_email">E-mail</label>
<div class='controls'>
<input autofocus="autofocus" class="text_area" ng-model="email" required="required" type="email" value="" name="user[email]" id="user_email" />
<span class='text-danger' ng-show='signin_form[&#39;user[email]&#39;].$error.required'>Required</span>
<span class='text-danger' ng-show='signin_form[&#39;user[email]&#39;].$error.email'>Invalid E-Mail address</span>
<span class='text-success' ng-show='signin_form[&#39;user[email]&#39;].$valid'>OK</span>
</div>
</div>
<div class='control-group'>
<label class="control-label" for="user_password">Password</label>
<div class='controls'>
<input autocomplete="off" class="text_area" minlength="8" required="required" ng-model="password" type="password" name="user[password]" id="user_password" />
<span class='text-danger' ng-show='signin_form[&#39;user[password]&#39;].$error.required'>Required</span>
<span class='text-danger' ng-show='signin_form[&#39;user[password]&#39;].$error.minlength'>Too short(less than 8 characters)</span>
<span class='text-success' ng-show='signin_form[&#39;user[password]&#39;].$valid'>OK</span>
</div>
</div>
<div>
<input name="user[remember_me]" type="hidden" value="0" /><input type="checkbox" value="1" name="user[remember_me]" id="user_remember_me" />
<label for="user_remember_me">Remember me</label>
</div>
<div><input type="submit" name="commit" value="Sign In" class="btn btn-primary" /></div>
</form><a target="_blank" href="/users/password/new">Forgot your password?</a>
<br>
<a target="_blank" href="/users/confirmation/new">Didn&#39;t receive confirmation instructions?</a>
<br>

<hr>
<div style='font-size: x-small'>

</div>
</hr>

</div>
</div>
</div>
</div>
<div>

<div autoscroll ng-view></div>
<div ng-show='noview'>

</div>
</div>
<div class='paizacloud-advertisement'>
<div class='img-wrapper'>
<a href='https://paiza.cloud/ja/' target='_blank'>
<img height='65' src='https://paiza.cloud/public/images/banner/bnr_960x125_en.png'>
</a>
</div>
</div>
</div>
<script>
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
    (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
    m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
    ga('create', 'UA-42027263-3', 'auto');
    ga('require', 'displayfeatures');
    if(current_user){
      ga('set', 'userId', 'uid-' + current_user.id);
      ga('set', 'userName', current_user.username);
      ga('set', 'dimension1', 'uid-' + current_user.id);
      ga('set', 'dimension2', 'LoggedIn');
    }else{
      ga('set', 'dimension2', 'NotLoggedIn');
    }
    // ga('send', 'pageview');
</script>
<script>
  var http_referer = "https://paiza.io/en/projects/new?language=java";
  console.log('HTTP_REFERER=', http_referer);
  if(http_referer && current_user){
    var parser = document.createElement('a')
    parser.href = http_referer;
    var pathname = parser.pathname;
    if(pathname.match(new RegExp("^(/users/auth/[a-z]+/callback|/users/confirmation)"))){
      ga('send', 'pageview', {page: pathname});
    }
  }
</script>
<script>
  var notice = null;
  console.log('notice=', notice);
  if(notice){
    ga('send', 'pageview', {page: '/notice/' + notice})
    ga('send', 'event', {
      eventCategory: 'notice',
      eventAction: 'show',
      eventLabel: notice,
    });
  }
</script>
<script>
  window.twttr = (function (d, s, id) {
    var t, js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src= "https://platform.twitter.com/widgets.js";
    fjs.parentNode.insertBefore(js, fjs);
    return window.twttr || (t = { _e: [], ready: function (f) { t._e.push(f) } });
  }(document, "script", "twitter-wjs"));
</script>
</body>
</html>
