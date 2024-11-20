<%@ page import="java.util.List" %>
<%@ page import="com.example.rsc.dto.OfertaDto" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="com.example.rsc.dto.TransporteDto" %>
<%@ page import="com.example.rsc.dto.ProveedorDto" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="style/style.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300..800;1,300..800&display=swap"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"
    />
    <title>Visualize Offer</title>
  </head>
  <body class="visualize-offer">
    <main>
      <div class="container-main">
        <h2>Offers</h2>
        <table class="offers">
          <thead>
            <tr>
              <th>Type</th>
              <th>Brand</th>
              <th>Capacity</th>
              <th>Date</th>
              <th>Hour</th>
              <th>Origin</th>
              <th>Departure</th>
            </tr>
          </thead>

          <%
            //noinspection unchecked
            List<OfertaDto> offers = (List<OfertaDto>) request.getAttribute("offers");
            for (OfertaDto offer : offers) {
              LocalDateTime dt = offer.getDepartureDateTime();
              TransporteDto transport = offer.getTransporteDto();
              ProveedorDto provider = offer.getProveedorDto();
          %>
          <tbody>
            <tr>
              <td><%= provider.getTipoProveedor() %></td>
              <td><%= transport.getMarca() %></td>
              <td><%= transport.getCapacidad() %></td>
              <td><%= dt.toLocalDate() %></td>
              <td><%= dt.toLocalTime() %></td>
              <td><%= offer.getOrigen() %></td>
              <td><%= offer.getDestino() %></td>
              <td>
                <button class="update" type="submit" id="update-button-<%= offer.getId() %>" name="update-button">Update</button>
                <button class="delete" type="submit" id="delete-button-<%= offer.getId() %>" name="delete-button">Delete</button>
              </td>
            </tr>
          <%
            }
          %>
        <a class="button-plus" href="./newOffer">
          <i class="fa-solid fa-plus fa-xl" style="color: #ffffff"></i>
        </a>
      </div>
    </main>
  </body>
</html>
