<#import "/macro/common.ftl" as common />
<#import "/spring.ftl" as spring />
<#assign portlet=JspTaglibs["http://java.sun.com/portlet_2_0"] />
<@portlet.defineObjects /> 
<@common.libInit />
<@spring.bind "command" />

This is the <b>Recipies</b> portlet in View mode.</br>

<table id="recipieTbl">
	<tr class="header">
		<th >Id</th>
		<th >Rec. name</th>
		<th >Rec. description</th>
		<th >Ready In</th>
		<th >category</th>
	</tr>
	<#list command.recipies as recipie>
	<tr class="row">
		<td >Id</td>
		<td >${recipie.name}</td>
		<td >${recipie.description}</td>
		<td >${recipie.readyIn}</td>
		<td >${recipie.category}</td>
	</tr>
	</#list>
</table>

<@portlet.renderURL var="addNewViewURL" portletMode="VIEW">
	<@portlet.param name="action" value="addNewView" />
</@portlet.renderURL>
</br>
</br>
<a href=${addNewViewURL}>Add New Recipie</a>

