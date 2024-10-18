<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="style/style.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300..800;1,300..800&display=swap"
      rel="stylesheet"
    />
    <title>Form Nueva Oferta</title>
  </head>
  <body>
    <main>
      <div class="container">
        <% String message = (String) request.getAttribute("message"); if
        (message != null) { %>
        <div class="message"><%= message %></div>
        <% } %>

        <form action="Offer" method="POST">
          <h1>New Offer</h1>
          <fieldset class="details">
            <h3>Vehicle details</h3>

            <label for="optionsType">Type:</label>
            <input
              type="hidden"
              value="createNewOffer"
              id="cNewOff"
              name="cNewOff"
            />
            <select class="options" id="optionsType" name="optionsType">
              <option value="" disabled selected>--Select--</option>
              <option value="Car">Car</option>
              <option value="Motorbike">Motorbike</option>
              <option value="Bus">Bus</option>
            </select>

            <label for="optionsBrand">Brand:</label>
            <select class="options" id="optionsBrand" name="optionsBrand">
              <option value="" disabled selected>--Select--</option>
              <option value="Mazda">Mazda</option>
              <option value="Chevrolet">Chevrolet</option>
              <option value="Renault">Renault</option>
              <option value="Honda">Honda</option>
            </select>

            <label for="capacity">Capacity:</label>
            <input type="number" id="capacity" name="capacity" />
          </fieldset>

          <fieldset class="provider">
            <h3>Provider details</h3>

            <label for="provider-name">Name:</label>
            <input type="text" id="provider-name" name="provider-name" />

            <label for="provider-type">Provider Type:</label>
            <input
              type="text"
              id="provider-type"
              name="provider-provider-type"
            />

            <label for="provider-email">Email:</label>
            <input type="text" id="provider-email" name="provider-email" />

            <label for="provider-phone-number">Phone Number:</label>
            <input
              type="tel"
              id="provider-phone-number"
              name="provider-phone-number"
            />
          </fieldset>

          <fieldset class="details-two">
            <label for="date">Date:</label>
            <input
              class="input-details-two"
              type="date"
              id="date"
              name="date"
            />

            <label for="time">Hour:</label>
            <input
              class="input-details-two"
              type="time"
              id="time"
              name="time"
            />

            <label for="origin">Origin:</label>
            <input
              class="input-details-two"
              type="text"
              id="origin"
              name="origin"
            />

            <label for="destination">Destination</label>
            <input
              class="input-details-two"
              type="text"
              id="destination"
              name="destination"
            />
          </fieldset>

          <button
            type="submit"
            value="save"
            class="createButton"
            id="creButton"
            name="creButton"
          >
            Create
          </button>
          <!-- <button class="createButton" id="listButton" name="listButton">
            <a href="./VisualizeOffer.jsp">List</a>
          </button> -->
        </form>
      </div>
    </main>
  </body>
</html>
