<#import "../parts/common.ftlh" as c>
<@c.page>
    <form name="book" action="/movie/add" method="post">
    <table class="table table-striped table-dark">
        <tr>
            <td>Title</td>
            <td><input title="Title" type="text" name="title"></td>
        </tr>
        <tr>
            <td>Director</td>
            <td><input title="Director" type="text" name="director"></td>
        </tr>
        <tr>
            <td>Year</td>
            <td><input title="Year" type="text" name="year"></td>
        </tr>
        <tr>
            <td>Date</td>
            <td><input title="Date" type="text" name="date"></td>
        </tr>
        <tr>
            <td>Imdb</td>
            <td><input title="Imdb" type="text" name="imdb"></td>
        </tr>
        <tr>
            <td>Ru-Title</td>
            <td><input title="Ru-Title" type="text" name="popup-title"></td>
        </tr>
        <tr>
            <td>Ru-Description</td>
            <td><input title="Ru-Description" type="text" name="popup-description"></td>
        </tr>
    </table>
        <input class="btn btn-outline-dark mb-4" type="submit" value="Save">
    </form>
</@c.page>