<#import "parts/common.ftlh" as c>
<@c.page>
    <#list posts as post>
    <div class="col-md-10 blogShort">
        <h4>${post.title}</h4>
        <#--<img src="${post.imageSrc}" alt="post img" class="pull-left img-responsive thumb margin10 img-thumbnail">-->
        <article><p>${post.body}</p></article>
    </div>
    </#list>


</@c.page>