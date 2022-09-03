import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CheckoutComponent } from './checkout/checkout.component';
import { ErrorComponent } from './error/error.component';
import { ListItemsComponent } from './list-items/list-items.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { RouteGuardService } from './service/route-guard.service';
import { TotalConfirmationComponent } from './total-confirmation/total-confirmation.component';
import { UserAdminComponent } from './user-admin/user-admin.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
  {path:'', component:LoginComponent},
  {path:'login', component:LoginComponent},
  {path:'welcome/:name', component:WelcomeComponent, canActivate: [RouteGuardService]},
  {path:'items', component:ListItemsComponent, canActivate: [RouteGuardService]},
  {path:'logout', component:LogoutComponent},
  {path:'checkout/:username', component:CheckoutComponent},
  {path:'userAdmin', component:UserAdminComponent},
  {path:'totalConfirmation/:username', component:TotalConfirmationComponent},
  {path:'**', component:ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
