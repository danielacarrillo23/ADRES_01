// Script para la funcionalidad interactiva de la aplicación de gestión de adquisiciones

// Simulación de datos de adquisiciones
const adquisiciones = [
    { presupuesto: "$10.000 millones", unidad: "Dirección de Medicamentos y Tecnologías en Salud", tipo: "Medicamentos", cantidad: 10000, valorUnitario: "$1.000", valorTotal: "$10.000.000", fecha: "20 de julio de 2023", proveedor: "Laboratorios Bayer S.A.", documentacion: ["Orden de compra No. 2023-07-20-001", "Factura No. 2023-07-20-001"] },
    // Agregar más adquisiciones según sea necesario
];

// Función para mostrar los resultados de la consulta
function mostrarResultadosConsulta(resultados) {
    const resultadosConsulta = document.getElementById("resultadosConsulta");
    resultadosConsulta.innerHTML = ""; // Limpiar resultados anteriores

    resultados.forEach(adquisicion => {
        const divAdquisicion = document.createElement("div");
        divAdquisicion.classList.add("adquisicion");

        // Crear y agregar elementos HTML para mostrar la información de la adquisición
        // Ejemplo: divAdquisicion.innerHTML = <p>Presupuesto: ${adquisicion.presupuesto}</p>;

        resultadosConsulta.appendChild(divAdquisicion);
    });
}

// Función para realizar la consulta
function realizarConsulta() {
    const filtro = document.getElementById("buscar").value;
    // Lógica para filtrar las adquisiciones según el filtro ingresado por el usuario
    // Ejemplo: const resultados = adquisiciones.filter(adquisicion => adquisicion.presupuesto.includes(filtro));

    // Llamar a la función para mostrar los resultados de la consulta
    // Ejemplo: mostrarResultadosConsulta(resultados);
}

// Evento click para el botón de buscar
document.getElementById("btnBuscar").addEventListener("click", realizarConsulta);


// Función para aplicar filtros
function aplicarFiltros() {
    // Implementa la lógica para filtrar de acuerdo a los criterios seleccionados
    // Por ejemplo, ordenar de menor a mayor fecha
    // O ordenar alfabéticamente de la A a la Z
    // O ordenar de menor a mayor número de orden
    alert("Se aplicarán filtros aquí.");
}

// Evento click para el botón de filtros
document.getElementById("btnFiltros").addEventListener("click", aplicarFiltros);


function filtrarPorPresupuesto() {
    // Lógica para filtrar por presupuesto
    // Por ejemplo: const resultados = adquisiciones.filter(adquisicion => adquisicion.presupuesto === "TuPresupuesto");
    // mostrarResultadosConsulta(resultados);
}

function filtrarPorFecha() {
    // Lógica para filtrar por fecha
    // Por ejemplo: const resultados = adquisiciones.filter(adquisicion => adquisicion.fecha === "TuFecha");
    // mostrarResultadosConsulta(resultados);
}


document.getElementById("btnBuscar").addEventListener("click", function() {
    var consulta = document.getElementById("inputBuscar").value;
    realizarBusqueda(consulta);
});

function realizarBusqueda(consulta) {
    // Aquí puedes agregar la lógica para realizar la búsqueda utilizando la consulta proporcionada
    alert("Buscar adquisiciones con consulta: " + texto);
}


// Supongamos que tienes un array de objetos con el historial de cambios
const historialCambios = [
    { id: 1, campo: "Presupuesto", valorAnterior: "$1000", valorNuevo: "$1500", fecha: "2024-06-01" },
    { id: 2, campo: "Unidad", valorAnterior: "Departamento A", valorNuevo: "Departamento B", fecha: "2024-06-02" },
    // Agrega más registros según sea necesario
];

// Función para llenar la tabla con el historial de cambios
function llenarTablaHistorial() {
    const tablaHistorial = document.getElementById("tablaHistorial");
    const tbody = tablaHistorial.getElementsByTagName("tbody")[0];

    // Limpiamos cualquier contenido previo en el tbody
    tbody.innerHTML = "";

    // Iteramos sobre el array de historial de cambios y agregamos las filas a la tabla
    historialCambios.forEach(cambio => {
        const fila = document.createElement("tr");

        const idCell = document.createElement("td");
        idCell.textContent = cambio.id;
        fila.appendChild(idCell);

        const campoCell = document.createElement("td");
        campoCell.textContent = cambio.campo;
        fila.appendChild(campoCell);

        const valorAnteriorCell = document.createElement("td");
        valorAnteriorCell.textContent = cambio.valorAnterior;
        fila.appendChild(valorAnteriorCell);

        const valorNuevoCell = document.createElement("td");
        valorNuevoCell.textContent = cambio.valorNuevo;
        fila.appendChild(valorNuevoCell);

        const fechaCell = document.createElement("td");
        fechaCell.textContent = cambio.fecha;
        fila.appendChild(fechaCell);

        tbody.appendChild(fila);
    });
}

// Llamamos a la función para llenar la tabla cuando se carga la página
document.addEventListener("DOMContentLoaded", llenarTablaHistorial);


datos

const ordenes = [
    { numero: "001", descripcion: "Orden 001 - Descripción de la orden 001" },
    { numero: "002", descripcion: "Orden 002 - Descripción de la orden 002" },
    // Agrega más órdenes según sea necesario
];


function buscarOrden(numeroOrden) {
    console.log("Buscando orden:", numeroOrden); // Agrega este console.log para verificar si la función se está llamando correctamente
    const resultado = ordenes.find(orden => orden.numero === numeroOrden);
    if (resultado) {
        mostrarResultadoConsulta(resultado.descripcion);
    } else {
        mostrarResultadoConsulta("Orden no encontrada");
    }
}


function mostrarResultadoConsulta(resultado) {
    const resultadosConsulta = document.getElementById("resultadosConsulta");
    resultadosConsulta.textContent = resultado;
}


document.getElementById("btnBuscarConsulta").addEventListener("click", function() {
    const numeroOrden = document.getElementById("buscar").value;
    buscarOrden(numeroOrden);
});

document.getElementById("btnBuscar").addEventListener("click", function() {
    const numeroOrden = document.getElementById("buscar").value;
    buscarOrden(numeroOrden);
});

cd "C:/Users/HP/OneDrive/Documents/PROYECTO-ADRES"


