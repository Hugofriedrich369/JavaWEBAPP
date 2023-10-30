<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exemplo de Lista com jstl</title>
    <style>
        body {
            background-color: #171717;
            color: white;
            text-align: center;
            font-family: Roboto;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        button {
            background-color: #3273DB;
            border: 0px none;
            width: 120px;
            height: 32px;
            border-radius: 4px;
            font-size: 16px;
            color: white;
            font-family: Roboto;
        }

        button:hover {
            background-color: #323EDB;
            cursor: pointer;
        }

        .active {
            background-color: #323EDB;
            cursor: not-allowed;
        }

        .itensContainer {
            background-color: #202020;
            text-align: center;
            padding: 5px;
            border-radius: 8px;
            margin-top: 10px;
        }

        .footerButtons button {
            margin-top: 10px;
            margin-bottom: 10px;
            width: 100%;
        }

        a {
            color: white;
        }
    </style>
</head>
<body>
<main>
    <h1>Lista de Veículos</h1>

    <div class="buttons">
        <form action="exemplo" method="get">
            <button type="submit" name="veiculo" value="carros">Carros</button>
            <button type="submit" name="veiculo" value="motos">Motos</button>
        </form>
    </div>
    <div class="itensContainer">
        <c:forEach var="item" items="${veiculos}">
            <p>${item}</p>
        </c:forEach>
    </div>
    <div class="footerButtons">
        <button onclick="limparLista()">Limpar lista</button>
        <br>
        <a href="/">Voltar para o início</a>
    </div>
</main>
<script>
    function limparLista() {
        window.location.href = '/exemplo';
    }
</script>
</body>
</html>