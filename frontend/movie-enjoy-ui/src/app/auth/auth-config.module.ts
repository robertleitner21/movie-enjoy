import { NgModule } from '@angular/core';
import { AuthModule } from 'angular-auth-oidc-client';


@NgModule({
    imports: [AuthModule.forRoot({
        config: {
            authority: 'https://dev-lv08jh-l.eu.auth0.com',
            redirectUrl: window.location.origin,
            clientId: 'inT5gbfggGj6ZEBWzYnfYNOhFqSzEJCn',
            scope: 'openid profile offline_access',
            responseType: 'code',
            silentRenew: true,
            useRefreshToken: true,
        }
      })],
    exports: [AuthModule],
})
export class AuthConfigModule {}
