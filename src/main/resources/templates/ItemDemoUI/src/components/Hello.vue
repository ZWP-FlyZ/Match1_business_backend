<template>
  <div class="jumbotron">
    <h1>{{list}}</h1>
    <p>
      <strong>
        <router-link to="/time-entries">创建一个任务</router-link>
      </strong>
    </p>
  </div>
</template>

<script>
	export default{
		data(){
			return {
				list: {}
			}
		},
		created(){
			this.$http({
				method:'GET',
				url:'/api/getData'
			}).then(function(data){
				this.list = data.bodyText
			},function(error){
				console.log(error)
			}).bind(this)
		}
	}
</script>
