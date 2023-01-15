<template>
  <l-header
    v-if="settingStore.showHeader"
    :show-logo="settingStore.showHeaderLogo"
    :theme="settingStore.displayMode"
    :layout="settingStore.layout"
    :is-fixed="settingStore.isHeaderFixed"
    :menu="headerMenu"
    :is-compact="settingStore.isSidebarCompact"
  />
</template>

<script>
export default {
  name: "Header"
}
</script>

<style scoped>

</style>
