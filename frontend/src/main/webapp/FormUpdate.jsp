<%-- Document : FormNewOffer Created on : 21 sept 2024, 18:48:37 Author : Maria
Camila --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <title>Form Update Offer</title>
  </head>
  <body>
    <main>
      <div class="container">
        <form method="post">
          <h1>Update Offer</h1>
          <fieldset class="details">
            <h3>Vehicle details</h3>

            <label for="">Type:</label>
            <select id="options">
              <option value="" disabled selected>--Select--</option>
              <option value="Car">Car</option>
              <option value="Motorbike">Motorbike</option>
              <option value="Bus">Bus</option>
            </select>

            <label for="">Brand:</label>
            <select id="options">
              <option value="" disabled selected>--Select--</option>
              <option value="Mazda">Mazda</option>
              <option value="Chevrolet">Chevrolet</option>
              <option value="Renault">Renault</option>
              <option value="Honda">Honda</option>
            </select>

            <label for="capacity">Capacity:</label>
            <input type="number" id="capacity" />
          </fieldset>

          <fieldset class="details-two">
            <label for="date">Date:</label>
            <input id="input-details-two" type="date" id="date" />

            <label for="time">Hour:</label>
            <input id="input-details-two" type="time" id="time" />

            <label for="origin">Origin:</label>
            <input id="input-details-two" type="text" id="origin" />

            <label for="departure">Departure:</label>
            <input id="input-details-two" type="text" id="departure" />
          </fieldset>

          <button class="createButton">Update</button>
        </form>
      </div>
    </main>
  </body>
</html>
