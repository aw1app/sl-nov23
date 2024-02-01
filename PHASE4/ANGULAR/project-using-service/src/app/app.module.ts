import { HttpClientModule } from "@angular/common/http";
import { AppComponent } from "./app.component";
import { NgModule } from "@angular/core";

@NgModule({
    imports: [HttpClientModule],
    providers:[HttpClientModule],
    bootstrap: [AppComponent]
})
export class AppModule { }