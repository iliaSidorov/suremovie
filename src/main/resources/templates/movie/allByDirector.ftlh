<#import "../parts/common.ftlh" as c>
<@c.page>
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
                <td>${movie.director}</td>
                <td>${movie.country}</td>
                <td>${movie.year}</td>
                <td>${movie.date}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</@c.page>