<#import "/spring.ftl" as spring />
<#assign portlet=JspTaglibs["http://java.sun.com/portlet_2_0"] /> 
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"] />

<@spring.bind "command" />

Add New <b>Recipe</b>.

<@portlet.actionURL var="addRecipieURL" portletMode="VIEW">
	<@portlet.param name="action" value="addRecipie" />
</@portlet.actionURL>

<@form.form method="POST" action="${addRecipieURL}" modelAttrubute="newRecipie">
	<table style="margin-left:80px">
        <tbody>
            <tr>
                <td><@form.label path="name">Recipe Name</@form.label></td>
                <td><@form.input path="name"></@form.input></td>
            </tr>
            <tr>
                <td><@form.label path="description.">description</@form.label></td>
                <td><@form.input path="description"></@form.input></td>
            </tr>
            <tr>`
                <td><@form.label path="readyIn">Ready In</@form.label></td>
                <td><@form.input path="readyIn"></@form.input></td>
            </tr>
            <tr>
                <td><@form.label path="category">Category</@form.label></td>
                <td><@form.input path="category"></@form.input></td>
            </tr>
            <tr> 
            <tr>
                <td colspan="2"><input type="submit" value="Add New Recipie" />
                </td>
            </tr>
        </tbody>
    </table>
</@form.form>