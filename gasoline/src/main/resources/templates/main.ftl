<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gasoline</title>
    <link rel="stylesheet" href="/static/style.css">

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://www.google.com/recaptcha/api.js"></script>
</head>
<body>
<div class="container mt-5">
    <h5>Калькулятор бензина</h5>
    <div>
        <div class="dropdown open my-3">
            <input class="btn btn-secondary dropdown-toggle" type="button" value="<#if name??>${name}<#else>Вид бензина:</#if>" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <form method="post">
                <button name="btn1" type="submit" class="dropdown-item">АИ-92</button>
                <button name="btn2" type="submit" class="dropdown-item">АИ-95</button>
                <button name="btn3" type="submit" class="dropdown-item">АИ-98</button>
                <button name="btn4" type="submit" class="dropdown-item">ДТ</button>
                <button name="btn5" type="submit" class="dropdown-item">Газ</button>
                </form>
            </div>
        </div>
    </div>
<#--    <div class="mb-3">-->
<#--        <form method="post">-->
<#--            <input type="number" name="money" placeholder="Введите сумму">-->
<#--            <button class="btn btn-primary" type="submit">Рассчёт</button>-->
<#--        </form>-->
<#--    </div>-->
    <div>
        <#if res??>
            ${res} л
        </#if>
    </div>
    <#if err??>
        <div class="alert alert-danger" role="alert">
            ${err}
        </div>
    </#if>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>