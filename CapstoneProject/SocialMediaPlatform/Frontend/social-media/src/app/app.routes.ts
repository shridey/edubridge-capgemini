import { Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { HomeComponent } from './components/home/home.component';
import { RouteGuardService } from './services/route-guard.service';
import { PostComponent } from './components/post/post.component';
import { ProfileComponent } from './components/profile/profile.component';
import { ProfileUpdateComponent } from './components/profile-update/profile-update.component';

export const routes: Routes = [
    { path: "", component: LoginComponent },
    { path: "login", component: LoginComponent },
    { path: "register", component: RegisterComponent },
    { path: "home", component: HomeComponent, canActivate: [RouteGuardService] },
    { path: "post", component: PostComponent, canActivate: [RouteGuardService] },
    { path: "post/:postId", component: PostComponent, canActivate: [RouteGuardService] },
    { path: "profile", component: ProfileComponent, canActivate: [RouteGuardService] },
    { path: "edit-profile", component: ProfileUpdateComponent, canActivate: [RouteGuardService] },

    { path: "**", component: PageNotFoundComponent }
];
