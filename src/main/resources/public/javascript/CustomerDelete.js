var rowIds = [];
		
		$(function() {
			$("#grid-basic").bootgrid({
				selection : true,
				multiSelect : true,
				rowSelect : true,
				keepSelection : true
			}).on("selected.rs.jquery.bootgrid", function(e, rows) {
				for (var i = 0; i < rows.length; i++) {
					rowIds.push(rows[i].no);
				}

			}).on("deselected.rs.jquery.bootgrid", function(e, rows) {
				for (var i = 0; i < rows.length; i++) {
					rowIds.some(function(v, ii) {
						if (v == rows[i].no)
							rowIds.splice(ii, 1);
					});
				}
			});
		});

