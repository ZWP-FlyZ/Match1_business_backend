
<template>
		<div id="application">
			<div class="application-heading">
				<span>我的应用</span>
			</div>
			<div class="application-list">
				<ul>
					<li>
						<i class="icon icon-triangle-right"></i>
						<router-link to="/content"><span>应用1</span></router-link>
					</li>
					<li>
						<i class="icon icon-triangle-right"></i>
						<router-link to="/content">应用2</router-link>
					</li>
					<li>
						<i class="icon icon-triangle-right"></i>
						<router-link to="/content">应用3</router-link>
					</li>
					<li>
						<router-link to="/registerApplication" class = "btn btn-primary">注册应用</router-link>
					</li>

				</ul>
			</div>
		</div>

	  	<!-- <div id = "panel-myApplication" class="panel panel-default">
		    <div class="panel-heading">
		      <h1 class="text-center">我的应用</h1>
		    </div>
		    <div class="panel-body">
		      <router-link to="/content">应用1</router-link>
		      <router-link to="/content">应用2</router-link>
		      <router-link to="/content">应用3</router-link>
		      <router-link to="/content">应用4</router-link>
		    </div>
	  	</div> -->
</template>


