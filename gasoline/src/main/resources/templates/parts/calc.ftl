<#macro calc>
    <h5>Калькулятор бензина</h5>
    <div>
        <div class="dropdown open my-3">
            <input class="btn btn-secondary dropdown-toggle" type="button" value="<#if name??>${name}<#else>Вид бензина:</#if>" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a class="dropdown-item" href="a92">АИ-92</a>
                <a class="dropdown-item" href="a95">АИ-95</a>
                <a class="dropdown-item" href="a98">АИ-98</a>
                <a class="dropdown-item" href="diesel">ДТ</a>
                <a class="dropdown-item" href="gas">Газ</a>
            </div>
        </div>
    </div>
    <div class="mb-3">
        <form method="post">
            <input type="number" name="money" placeholder="0">
            <button class="btn btn-primary" type="submit">Рассчёт</button>
        </form>
    </div>
    <div  class="mb-3">
        <#if price??>
        Цена за литр: ${price} руб
        </#if>
    </div>
    <div  class="mb-3">
        <#if res??>
            ${res} л
        </#if>
    </div  class="mb-3">
    <#if err??>
        <div class="alert alert-danger" role="alert">
            ${err}
        </div>
    </#if>
</#macro>