<#import "../parts/common.ftlh" as c>
<@c.page>
    <a class="btn btn-outline-dark mb-4" href="/movie/add" role="button">Add movie</a>
    <table class="table table-striped table-dark">
        <thead>
        <tr>
            <th scope="col">Title</th>
            <th scope="col">Director</th>
            <th scope="col">Country</th>
            <th scope="col">Year</th>
            <th scope="col">Watched</th>
        </tr>
        </thead>
        <tbody>
        <#list movies as movie>
        <tr>
            <td><a href="${movie.imdb}" title="${movie.popupTitle}" data-toggle="popover" data-placement="left" data-trigger="hover" data-content="${movie.popupDescription}">${movie.title}</a></td>
            <td><a href="/movie/allByThisDirector/${movie.director}">${movie.director}</a></td>
            <td>${movie.country}</td>
            <td>${movie.year}</td>
            <td>${movie.date}</td>
        </tr>
        </#list>
        </tbody>
    </table>
    <br>
    Watched: ${count + " movies"}
    <br/><br/>
</@c.page>