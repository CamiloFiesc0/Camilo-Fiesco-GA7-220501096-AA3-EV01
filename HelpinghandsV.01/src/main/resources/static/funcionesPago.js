function eliminarPago(numfactura) {
	console.log(numfactura);
	swal({
		  title: "Esta seguro de Eliminar?",
		  text: "Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/eliminarPago/"+numfactura,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("Registro eliminado", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listarPago";
		    	}
		    });
		  } else{
                      swal("Acabe de cancelar la solicitud");
                  }
		});
}



