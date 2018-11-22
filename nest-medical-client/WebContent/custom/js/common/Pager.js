var Pager = function(_config) {

	var pageSizeArray = [ 15, 30, 45, 60, 75 ];
	var config = _config || {};
	var defaultConfig = {
		maxPageNumberElements : 7
	};
	$.extend(defaultConfig, config);
	config = defaultConfig;
	var instance = this;
	instance.pageSize = pageSizeArray[0];
	this.remove = function() {
		if (instance.infoElement) {
			instance.infoElement.remove();
			instance.infoElement = null;
		}
		if (instance.numberElement) {
			instance.numberElement.remove();
			instance.numberElement = null;
		}
	};
	this._buildPageNumberElements = function(numberElement, page) {

		var currentPageNumber = page.number;
		var halfPageNumberElements = config.maxPageNumberElements >> 1;
		var totalPagesIndex = page.totalPages - 1;
		var firstNumber = currentPageNumber - halfPageNumberElements;
		var lastNumber = currentPageNumber + halfPageNumberElements;
		while (firstNumber < 0) {
			firstNumber++;
			if (lastNumber < totalPagesIndex) {
				lastNumber++;
			}

		}
		while (lastNumber > totalPagesIndex) {
			lastNumber--;
			if (firstNumber > 0) {
				firstNumber--;
			}
		}

		for (var pageNumber = firstNumber; pageNumber <= lastNumber; pageNumber++) {
			var pageNumberElement = $('<a class="paginate_button " tabindex="0">'
					+ (pageNumber + 1) + '</a>');
			pageNumberElement.data('pageNumber', pageNumber);
			if (pageNumber == currentPageNumber) {
				pageNumberElement.addClass('current');
			}
			numberElement.append(pageNumberElement);
		}
	};
	this._handleCallback = function(e, pageNumber) {
		if (config.onPageChange) {

			config.onPageChange.call(this, e, pageNumber);

		}
	};
	this.setPage = function(page) {

		instance.remove();
		if(page.totalElements<1){
			return;
		}
		var info = ' 条数据,总共' + page.totalElements + '条数据(' + page.totalPages+ '页)';
		var pageSizeSelect = $('<select></select>');
		$.each(pageSizeArray, function() {
			var option = $('<option></option>');
			option.attr('value', this);
			option.text(this);
			if (page.size == this) {
				option.attr('selected', 'selected');
			}
			pageSizeSelect.append(option);
		});
		pageSizeSelect.change(function() {
			var pageSize = $(this).val();
			if (config.onPageSizeChange) {
				instance.pageSize = parseInt(pageSize);
				config.onPageSizeChange.call(this, instance.pageSize);
			}
		});
		var infoElement = $('<div class="dataTables_info" role="status" aria-live="polite">每页显示:</div>');
		infoElement.append(pageSizeSelect).append(info);
		// infoElement.html(info);
		$(config.wrapper).append(infoElement);
		instance.infoElement = infoElement;

		var numberElement = $('<div class="dataTables_paginate paging_full_numbers"></div>');
		var firstPageElement = $('<a class="paginate_button first">首页</a>');

		var previousPageElement = $('<a class="paginate_button previous">上一页</a>');
		if (page.first) {
			firstPageElement.addClass('disabled');
			previousPageElement.addClass('disabled');
		}

		var nextPageElement = $('<a class="paginate_button next">下一页</a>');
		var lastPageElement = $('<a class="paginate_button last">尾页</a>');
		if (page.last) {
			nextPageElement.addClass('disabled');
			lastPageElement.addClass('disabled');
		}
		firstPageElement.data('pageNumber', 0);
		previousPageElement.data('pageNumber', page.number - 1);
		nextPageElement.data('pageNumber', page.number + 1);
		lastPageElement.data('pageNumber', page.totalPages - 1);
		numberElement.append(firstPageElement).append(previousPageElement);
		instance._buildPageNumberElements(numberElement, page);
		numberElement.append(nextPageElement).append(lastPageElement);
		$(config.wrapper).append(numberElement);
		instance.numberElement = numberElement;
		$('a.paginate_button', numberElement).click(
				function(e) {
					var fire = !$(this).hasClass('disabled')
							&& !$(this).hasClass('current');
					if (fire) {
						var pageNumber = $(this).data('pageNumber');
						instance._handleCallback(e, pageNumber);
					}

				});
	};

};