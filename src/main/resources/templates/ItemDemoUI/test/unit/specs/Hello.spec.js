import Vue from 'vue'
import Delete from '@/components/Delete'

describe('Delete.vue', () => {
  it('should render correct contents', () => {
    const Constructor = Vue.extend(Delete)
    const vm = new Constructor().$mount()
    expect(vm.$el.querySelector('link-btn-blue').textContent)
      .to.equal('确定')
  })
})
