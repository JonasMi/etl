var Indexer = function() {

	var instance = this;

	this.loadFrame = function(url) {
		$('#content').attr('src', url);
	};
	this.openNav = function(navChild) {
		$('li.nav-parent').removeClass('nav-active');
		$('ul.children').hide();
		

		var navItem = navChild.parent();
		var navList = navItem.parent();
		var navParent = navList.parent();
		navParent.addClass('nav-active');
		navList.show();
		
		var href = navChild.attr('href');
		instance.loadFrame(href);

	};
	this.getDefaultNav = function() {
		var navParents = $('li.nav-parent');
		for (var i = 0; i < navParents.length; i++) {
			var navParent = $(navParents[i]);
			var navChildren = navParent.find('ul.children>li>a');
			for (var j = 0; j < navChildren.length; j++) {
				var navChild = $(navChildren[j]);
				return navChild;

			}
		}
		return null;
	};
	this.openDefaultNav = function() {
		var nav = instance.getDefaultNav();
		if (nav) {
			instance.openNav(nav);
		}
	};
	this.init = function() {

		this.openDefaultNav();
		$('#refreshFrame').click(
				function(e) {
					e.preventDefault();
					document.getElementById('content').contentWindow.location
							.reload(true);
				});
	};
};
$(document).ready(function() {
	new Indexer().init();
});