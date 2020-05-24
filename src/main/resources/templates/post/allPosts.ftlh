<#import "../parts/common.ftlh" as c>
<@c.page>
    <#list posts as post>
        <article>
            <header>
                <a href="#" class="badge badge-primary">Category</a>
                <h1>${post.title}</h1>
                <div>Posted on: <time datetime="${post.created}"></time> </div>
                <div><span class="badge badge-primary mr-1">13 likes</span><span class="badge badge-primary">3 comments</span> </div>
                <div>
                    <a href="#" class="badge badge-secondary">#tag</a>
                    <a href="#" class="badge badge-secondary">#longtag</a>
                    <a href="#" class="badge badge-secondary">#tag</a>
                    <a href="#" class="badge badge-secondary">#longtag</a>
                    <a href="#" class="badge badge-secondary">#tag</a>
                    <a href="#" class="badge badge-secondary">#verylongtag</a>
                </div>
            </header>

        <section id="main">
            <figure class="figure">
                <img src="${post.imageSrc}" class="figure-img img fluid mt-1" alt="fig-im">
                <figcaption class="figure-caption">
                    <p>Lorem ipsim dolor sit amen</p>
                    <p>Photo by: Name</p>
                </figcaption>
            </figure>
            <p class="lead">${post.body}</p>
        </section>
        </article>
    </#list>


</@c.page>










<#--<div class="card mb-3" style="max-width: 540px;">
            <div class="row no-gutters">
                <div class="col-md-4">
                    <img src="${post.imageSrc}" class="card-img" alt="shur1">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">${post.title}</h5>
                        <p class="card-text">${post.body}</p>
                        <p class="card-text"><small class="text-muted">${post.created}</small></p>
                    </div>
                </div>
            </div>
        </div>-->